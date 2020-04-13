package com.afisha.dao;

import com.afisha.model.Event;

import java.util.List;

public interface EventDAO{
    List<Event> allEvents();

    void add(Event event);

    void delete(Event event);

    void edit(Event event);

    Event getById(int id_event);
}

