package handler;

import command.Command;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 022 22.02.17.
 */
public class CommandHandler {

    Set<Command> set;

    public CommandHandler() {
        set = new HashSet<Command>();
    }

    public void handle(String[] args) {
        for (String arg : args) {
            set.add(createCommand(arg));
        }
    }

    private Command createCommand(String s) {
        return Command.createCommand(s);
    }
}
