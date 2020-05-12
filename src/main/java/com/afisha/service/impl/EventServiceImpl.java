package com.afisha.service.impl;

import com.afisha.dao.EventDAO;
import com.afisha.model.Event;
import com.afisha.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    private EventDAO eventDAO;

    @Autowired
    public void setGenreDAO(EventDAO eventDAO) {
        this.eventDAO = eventDAO;
    }

    @Transactional
    public List<Event> allEvents() {
        return eventDAO.allEvents();
    }

    @Transactional
    public void add(Event event) {
        eventDAO.add(event);
    }

    @Transactional
    public void delete(Event event) {
        eventDAO.delete(event);
    }

    @Transactional
    public void edit(Event event) {
        eventDAO.edit(event);
    }

    @Transactional
    public Event getById(int id) {
        return eventDAO.getById(id);
    }
}
