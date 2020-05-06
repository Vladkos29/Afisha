package com.afisha.controller;

import com.afisha.model.Event;
import com.afisha.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {
    private EventService eventService;

    @ Autowired
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    //Получаем список мест из сервиса и добавляем его в модель
    @ RequestMapping(method = RequestMethod.GET)
    public RestResponse allEvents() {
        return new RestResponse(eventService.allEvents());
    }


    @ RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public RestResponse editPage(@PathVariable("id") int id) {
        return new RestResponse(eventService.getById(id));
    }

    @ RequestMapping(value = "/edit", method = RequestMethod.POST)
    public RestResponse editEvent(@RequestBody Event event) {
        eventService.edit(event);
        return new RestResponse();
    }

    @ RequestMapping(value = "/add", method = RequestMethod.POST)
    public RestResponse addEvent(@RequestBody Event event) {
        eventService.add(event);
        return new RestResponse();
    }

    @ RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public RestResponse deleteEvent(@PathVariable("id") int id) {
        Event event = eventService.getById(id);
        eventService.delete(event);
        return new RestResponse();
    }
}