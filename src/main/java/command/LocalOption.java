package command;

/**
 * Created by User on 022 22.02.17.
 */
public class LocalOption extends Command {

    public LocalOption() {
//        LocalOption.pattern = "--+";
        this.eq = "=";
        this.preffix = "--";
    }
}
