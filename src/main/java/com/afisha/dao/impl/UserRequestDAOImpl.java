package com.afisha.dao.impl;

import com.afisha.dao.UserRequestDAO;
import com.afisha.model.UserRequest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRequestDAOImpl implements UserRequestDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<UserRequest> allUserRequest() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from UserRequest").list();
    }

    @Override
    public void add(UserRequest userRequest) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(userRequest);
    }

    @Override
    public void delete(UserRequest userRequest) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(userRequest);
    }

    @Override
    public void edit(UserRequest userRequest) {
        Session session = sessionFactory.getCurrentSession();
        session.update(userRequest);
    }

    @Override
    public UserRequest getById(int id_request) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(UserRequest.class, id_request);
    }
}

