package com.afisha.service.impl;

import com.afisha.dao.UserRequestDAO;
import com.afisha.model.UserRequest;
import com.afisha.service.UserRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserRequestServiceImpl implements UserRequestService {
    private UserRequestDAO userRequestDAO;

    @Autowired
    public void setUserRequestDAO(UserRequestDAO userRequestDAO) {
        this.userRequestDAO = userRequestDAO;
    }

    @Transactional
    public List<UserRequest> allUserRequest() {
        return userRequestDAO.allUserRequest();
    }

    @Transactional
    public void add(UserRequest userRequest) {
        userRequestDAO.add(userRequest);
    }

    @Transactional
    public void delete(UserRequest userRequest) {
        userRequestDAO.delete(userRequest);
    }

    @Transactional
    public void edit(UserRequest userRequest) {
        userRequestDAO.edit(userRequest);
    }

    @Transactional
    public UserRequest getById(int id_request) {
        return userRequestDAO.getById(id_request);
    }
}
