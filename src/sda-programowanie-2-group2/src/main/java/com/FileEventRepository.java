package com;

import java.util.ArrayList;
import java.util.List;

public class FileEventRepository implements EventsRepository {
    private List<Event> Events = new ArrayList<>();



    @Override
    public List<Event> getNextEvent() {
        return null;
    }

    @Override
    public Event getnextEvent() {
        return null;
    }

    @Override
    public void addEvent(Event event) {

    }

    @Override
    public void save(Event event) {

    }
}
