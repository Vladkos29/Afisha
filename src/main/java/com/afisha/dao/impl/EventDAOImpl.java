package com.afisha.dao.impl;

import com.afisha.dao.EventDAO;
import com.afisha.model.Event;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EventDAOImpl implements EventDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Event> allEvents() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Event").list();
    }


    @Override
    public void add(Event event) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(event);
    }

    @Override
    public void delete(Event event) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(event);
    }

    @Override
    public void edit(Event event) {
        Session session = sessionFactory.getCurrentSession();
        session.update(event);
    }

    @Override
    public Event getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Event.class, id);
    }
}
