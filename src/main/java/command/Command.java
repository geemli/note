package command;

import java.util.Set;
import java.util.regex.Pattern;

/**
 * Created by User on 022 22.02.17.
 */
public abstract class Command {

    protected static String pattern;
    protected static Set<Data> set;

    protected String preffix;
    protected String suffix;

    protected String arg;
    protected String value;

    protected String eq;


    public static Command createCommand(String s) {
        if (Pattern.matches("--arg=a", s)) {
//        if (Pattern.matches(GlobalOption.pattern, s)) {
            return new GlobalOption();
        } else if (Pattern.matches("--name=dima", s)) {
//        } else if (Pattern.matches(LocalOption.pattern, s)) {
            return new LocalOption();
        } else if (Pattern.matches("add", s)) {
//        } else if (Pattern.matches(Operation.pattern, s)) {
            return new Operation();
        } else {
            throw new IllegalArgumentException("no match pattern " + s);
        }
    }
}
