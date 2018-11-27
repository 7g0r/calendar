package calendar;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CommandRuner {
    private Map<String, Commands> map = new HashMap<>();


    public CommandRuner(LocalDateParser localDateParser,EventService eventService) {
      addCommand(new PrintAllCommand(eventService));
      addCommand(new HelpCommand(this));
      addCommand(new PrintNextCommand(eventService));
      addCommand(new AddCommand(eventService , localDateParser));
      addCommand(new CloseCommand());
    }
    private void addCommand(Commands commands){
        map.put(commands.getActionName().trim().trim().toUpperCase(), commands);
    }
    private void removeCommand(Commands commands){
        map.remove(commands.getActionName().trim().toUpperCase());
    }
    private Optional <Commands> getCommands(String actionName){
        return Optional.ofNullable( map.get(actionName.trim().toUpperCase()));
    }
    void runCommand(String actionName){
        getCommands(actionName).ifPresent(Commands::run);
    }

    public Map<String, Commands> getMap() {
        return map;
    }
}
