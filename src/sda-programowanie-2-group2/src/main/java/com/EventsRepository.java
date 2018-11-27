package com;

import java.util.List;

public interface EventsRepository {
    List<Event> getNextEvent();
    Event getnextEvent();
    void addEvent (Event event);
    void save (Event event);
}
