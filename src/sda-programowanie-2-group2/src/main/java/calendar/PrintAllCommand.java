package calendar;

import java.util.HashMap;
import java.util.Map;

public class PrintAllCommand implements Commands{
    private final EventService eventService;

    public PrintAllCommand(EventService eventService) {
        this.eventService = eventService;
    }

    @Override
    public void run() {
        eventService.printAllEvents();
    }

    @Override
    public String getHelpMessage() {
        return "Ta komenda wyświetla wszystkie wydarzenia";
    }

    @Override
    public String getActionName() {
        return "All";
    }
}
