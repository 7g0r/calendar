package calendar;
import javax.xml.bind.JAXB;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
public class EventXmlRepository implements EventRepository{
    private final PropertiesLoader propertiesLoader;
    private final LocalDateParser localDateParser;

    public EventXmlRepository(PropertiesLoader propertiesLoader,
                              LocalDateParser localDateParser) {
        this.propertiesLoader = propertiesLoader;
        this.localDateParser = localDateParser;

    }
    @Override
    public List<Event> getAll() {
        File xml = new File(propertiesLoader.getEventPath());
        Calendar unmarshal = JAXB.unmarshal(xml, Calendar.class);
        return unmarshal.getEventList();

    }

    @Override
    public Optional<Event> closestEvent() {
        List<Event> all = getAll();
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime closestTimeFromNow = LocalDateTime.MAX;
        Event closest = null;
        for (Event event : all) {
            String date = event.getDate();
            LocalDateTime localDateTime = localDateParser.toLocalDateTime(date);
            if (localDateTime.isAfter(now) && localDateTime.isBefore(closestTimeFromNow)) {
                closestTimeFromNow = localDateTime;
                closest = event;
            }
        }
        return Optional.ofNullable(closest);
    }

    @Override
    public void save(Event event) throws IOException {
        Calendar unmarshal = JAXB.unmarshal(new File(propertiesLoader.getEventPath()),Calendar.class);
        unmarshal.getEventList().add(event);
        JAXB.marshal(unmarshal, propertiesLoader.getEventPath());
    }
}


