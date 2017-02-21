package main;

import handler.CommandHandler;

/**
 * Created by User on 022 22.02.17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        args = new String[]{"--arg=a", "add", "--name=dima", "number=666"};
        if (args.length > 0) {
            CommandHandler handler = new CommandHandler();
            handler.handle(args);
        } else {
            throw new IllegalArgumentException("no parameters");
        }
    }
}
