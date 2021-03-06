package com.afisha.service;

import com.afisha.model.UserRequest;

import java.util.List;

public interface UserRequestService {
    List<UserRequest> allUserRequest();
    void add(UserRequest userRequest);
    void delete(UserRequest userRequest);
    void edit(UserRequest userRequest);
    UserRequest getById(int id_request);
}
