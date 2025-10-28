package server;

import commands.Command;
import parser.ParsedCommand;

import java.util.Map;

public class CommandHandler {
    public static void handle(ParsedCommand command, Map<String, Command> commands) {
        System.out.println(command.command + ": command not found");
    }
}
