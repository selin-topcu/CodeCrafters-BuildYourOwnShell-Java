package parser;

import java.util.List;

public class ParsedCommand {
    public String command;
    public List<String> args;

    public static ParsedCommand fromInput(String line) {
        ParsedCommand response = new ParsedCommand();
        response.command = line;
        return response;
    }
}
