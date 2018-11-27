package calendar;

import lombok.Data;

import java.io.IOException;
import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

@Data
public class AddCommand implements Commands {
    private EventService eventService;
    private LocalDateParser localDateParser;

    public AddCommand(EventService eventService, LocalDateParser localDateParser) {
        this.eventService = eventService;
        this.localDateParser = localDateParser;
    }

    @Override
    public void run() {
        String name;
        String data;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę wydarzenia ; ");
        name = scanner.nextLine();
        System.out.println("Podaj datę wydarzenia format DDMMYYYY HH:MM");

        data = scanner.nextLine();
        try {
            localDateParser.toLocalDateTime(data);
            eventService.addNewEvent(data , name);
        } catch (IOException e) {
            System.out.println("Nie udało się znaleźć");
        } catch ( DateTimeParseException e){
            System.out.println("Pomyłka, popraw format");
            run();
        }
    }

    @Override
    public String getHelpMessage() {
        return "Metoda dodaje wydarzenie";
    }

    @Override
    public String getActionName() {
        return "add";
    }
}
