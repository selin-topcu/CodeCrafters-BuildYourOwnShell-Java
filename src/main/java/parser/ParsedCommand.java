package parser;

import java.util.Arrays;
import java.util.List;

public class ParsedCommand {
    public String command;
    public List<String> args;

    public static ParsedCommand fromInput(String line) {
        ParsedCommand response = new ParsedCommand();
        String[] parts = line.split(" ");
        response.command = parts[0];
        response.args = Arrays.asList(parts).subList(1, parts.length);
        return response;
    }
}
