package commands;

import parser.ParsedCommand;

import java.util.Map;

public class TypeCommand implements Command {
    Map<String, Command> commands;

    public TypeCommand(Map<String, Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute(ParsedCommand command) {
        for (String arg : command.args) {
            if (commands.containsKey(arg)) {
                String type = commands.get(arg).type();
                System.out.println(type);
            } else {
                System.out.println(arg + ": not found");
            }
        }
    }

    @Override
    public String type() {
        return "type is a shell builtin";
    }
}
