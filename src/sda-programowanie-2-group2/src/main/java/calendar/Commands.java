package calendar;

import java.io.IOException;

public interface Commands {
    void run() ;
    String getHelpMessage();
    String getActionName();
}
