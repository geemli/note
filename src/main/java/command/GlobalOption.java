package command;

/**
 * Created by User on 022 22.02.17.
 */
public class GlobalOption extends Command {

    public GlobalOption() {
//        GlobalOption.pattern = "--";
        this.eq = "=";
        this.preffix = "--";
    }
}
