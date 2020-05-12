package com.afisha.controller;

import com.afisha.model.UserRequest;
import com.afisha.service.UserRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserRequestController {
    private UserRequestService userRequestService;

    @Autowired
    public void setUserRequestService(UserRequestService userRequestService) {
        this.userRequestService = userRequestService;
    }

    //Получаем список заявок из сервиса и добавляем его в модель
    @RequestMapping(value = "/requests", method = RequestMethod.GET)
    public RestResponse allUserRequest() {
        return new RestResponse(userRequestService.allUserRequest());
    }


    @ RequestMapping(value = "/requests/edit/{id}", method = RequestMethod.GET)
    public RestResponse editPage(@PathVariable("id") int id_request) {
        return new RestResponse(userRequestService.getById(id_request));
    }

    @ RequestMapping(value = "/requests/edit", method = RequestMethod.POST)
    public RestResponse editUserRequest(@RequestBody UserRequest userRequest) {
        userRequestService.edit(userRequest);
        return new RestResponse();
    }

    @ RequestMapping(value = "/requests/add", method = RequestMethod.POST)
    public RestResponse addUserRequest(@RequestBody UserRequest userRequest) {
        userRequestService.add(userRequest);
        return new RestResponse();
    }

    @ RequestMapping(value = "/requests/delete/{id}", method = RequestMethod.GET)
    public RestResponse deleteEvent(@PathVariable("id") int id_request) {
        UserRequest userRequest = userRequestService.getById(id_request);
        userRequestService.delete(userRequest);
        return new RestResponse();
    }
}
