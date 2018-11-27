package calendar;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Optional;
public class EventService {

    private final EventRepository repository;
    private final LocalDateParser localDateParser;

     public EventService(EventRepository repository,
                 LocalDateParser localDateParser) {
        this.repository = repository;
        this.localDateParser = localDateParser;
    }

     public void printAllEvents() {
//        for (Event event : repository.getAll()) {
//            printEvent(event);
//        }
        repository.getAll().stream()
                .map(this::getDisplayEvent)
                .forEach(System.out::println);
    }

     public  void printClosestEvent() {
        Optional<Event> event = repository.closestEvent();
        String display = event.map(this::getDisplayEvent)
                .orElse("Nie ma najblizszego wydarzenia");
        System.out.println(display);
    }
    public void  addNewEvent (String data, String name) throws IOException {
        Event event = new Event(data, name);
        repository.save(event);
    }
    public void saveEvent(){

    }


    private String getDisplayEvent(Event event) {
        String displayString = localDateParser.toDisplayString(event.getDate());
        return "Event name:"
                + event.getName()
                +"\ndate: "
                + displayString;
    }
}
