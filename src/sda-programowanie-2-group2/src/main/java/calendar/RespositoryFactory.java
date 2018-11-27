package calendar;

import java.util.Optional;

public class RespositoryFactory {
    PropertiesLoader propertiesLoader;
    EventLineParser eventLineParser;
    LocalDateParser localDateParser;

    public RespositoryFactory(PropertiesLoader propertiesLoader, EventLineParser eventLineParser, LocalDateParser localDateParser) {
        this.propertiesLoader = propertiesLoader;
        this.eventLineParser = eventLineParser;
        this.localDateParser = localDateParser;
    }

    EventRepository getRepository() {
        String path = propertiesLoader.getEventPath();
        if (path.endsWith("xml")) {
            return new EventXmlRepository(propertiesLoader, localDateParser);
        }
        return new EventTxtRepository(propertiesLoader, eventLineParser, localDateParser);
    }


}

