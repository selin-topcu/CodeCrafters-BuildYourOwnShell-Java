package server;

import commands.Command;
import parser.ParsedCommand;

import java.util.Map;

public class CommandHandler {
    public static void handle(ParsedCommand command, Map<String, Command> commands) {
        if (commands.containsKey(command.command)) {
            commands.get(command.command).execute(command);
        } else {
            System.out.println(command.command + ": command not found");
        }
    }
}
