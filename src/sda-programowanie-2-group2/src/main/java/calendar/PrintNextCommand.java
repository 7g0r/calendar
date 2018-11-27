package calendar;

import java.io.IOException;

public class PrintNextCommand implements Commands {
    EventService eventService;

    public PrintNextCommand(EventService eventService) {
        this.eventService = eventService;
    }


    @Override
    public void run() {
        eventService.printClosestEvent();

    }

    @Override
    public String getHelpMessage() {
        return "Najbliższe przyszłe wydarzenie";
    }

    @Override
    public String getActionName() {
        return "next";
    }
}
