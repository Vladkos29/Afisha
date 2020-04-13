package com.afisha.service;

import com.afisha.model.Event;

import java.util.List;

public interface EventService {
    List<Event> allEvents();
    void add(Event event);
    void delete(Event event);
    void edit(Event event);
    Event getById(int id);
}
