package calendar;

public class CloseCommand implements Commands{
    @Override
    public void run() {
        System.exit(0);
    }

    @Override
    public String getHelpMessage() {
        return "Zamyka Aplikacje";
    }

    @Override
    public String getActionName() {
        return "close";
    }
}
