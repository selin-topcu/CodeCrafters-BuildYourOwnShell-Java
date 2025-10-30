package commands;

import parser.ParsedCommand;

import java.util.List;

public class ExitCommand implements Command {

    @Override
    public void execute(ParsedCommand command) {
        StatusReport statusReport = checkArgs(command.args);
        if (statusReport.success) {
            System.exit(statusReport.exitCode);
        }
        System.exit(0);
    }

    private StatusReport checkArgs(List<String> args) {
        StatusReport statusReport = new StatusReport();
        if (args.isEmpty()) {
            statusReport.exitCode = 0;
            statusReport.success = true;
            return statusReport;
        } else if (args.size() > 1) {
            System.out.println("exit: too many arguments");
        } else {
            statusReport.success = true;
            String status = args.getFirst();
            try {
                statusReport.exitCode = Integer.parseInt(status);
            } catch (NumberFormatException e) {
                System.out.println("exit: " + status + ": numeric argument required");
            }
        }
        return statusReport;
    }
}
