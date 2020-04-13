package com.afisha.dao.impl;

import com.afisha.dao.GenreDAO;
import com.afisha.model.Genre;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GenreDAOImpl implements GenreDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Genre> allGenres() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Genre").list();
    }

    @Override
    public void add(Genre genre) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(genre);
    }

    @Override
    public void delete(Genre genre) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(genre);
    }

    @Override
    public void edit(Genre genre) {
        Session session = sessionFactory.getCurrentSession();
        session.update(genre);
    }

    @Override
    public Genre getById(int id_genre) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Genre.class, id_genre);
    }
}