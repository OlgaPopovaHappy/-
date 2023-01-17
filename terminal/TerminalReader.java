package terminal;

import terminal.executable.CommandExecutable;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser; // парсит комманду и возвращает массив

    public static TerminalReader getInstance(CommandParser commandParser) {
        if (terminalReader == null)
            terminalReader = new TerminalReader(commandParser);
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public void readerInfo(int Info) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String[] order = commandParser.parseCommand(sc.nextLine());
            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();
            CommandExecutable commandExecutable = commandExecutableFactory.create(order);
            commandExecutable.execute();
        }
    }
}
