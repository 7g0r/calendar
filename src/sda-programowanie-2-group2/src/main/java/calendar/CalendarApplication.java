package calendar;

import java.io.IOException;
import java.util.Scanner;

public class CalendarApplication {
    public static void main(String[] args) throws IOException {
        PropertiesLoader properties = new PropertiesLoader();
        EventLineParser parser = new EventLineParser();
        LocalDateParser localDateParser = new LocalDateParser(properties);
        RespositoryFactory respositoryFactory = new RespositoryFactory(properties,parser ,localDateParser);

        EventRepository eventRepository = respositoryFactory.getRepository();
        EventService eventService = new EventService(eventRepository, localDateParser);
        CommandRuner commandRuner = new CommandRuner(localDateParser ,eventService);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz Help aby wyświetlić liste czynności: ");
        while (true){
             String command = scanner.nextLine();
             commandRuner.runCommand(command);
         }




    }
}
