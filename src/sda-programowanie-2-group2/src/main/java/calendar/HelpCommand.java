package calendar;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class HelpCommand implements Commands{

    private CommandRuner commandRuner;

    public HelpCommand(  CommandRuner commandRuner) {
        this.commandRuner = commandRuner;
    }

    @Override
    public void run() {
        Map<String, Commands> map = commandRuner.getMap();
        Collection<Commands> values = map.values();
        for (Commands value : values) {
            System.out.println(value.getActionName() + " = " + value.getHelpMessage());
        }

    }

    @Override
    public String getHelpMessage() {
        return "Komenda wyświetla wszystkie dostepne metody";
    }

    @Override
    public String getActionName() {
        return "Help";
    }
}
