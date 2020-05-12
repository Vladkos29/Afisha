package com.afisha.controller;

import com.afisha.model.Place;
import com.afisha.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlacesController {
    private PlaceService placeService;

    @Autowired
    public void setPlaceService(PlaceService placeService) {
        this.placeService = placeService;
    }

    //Получаем список мест из сервиса и добавляем его в модель
    @RequestMapping(value = "/places", method = RequestMethod.GET)
    public RestResponse allPlaces() {
        return new RestResponse(placeService.allPlaces());
    }


    @ RequestMapping(value = "/places/edit/{id}", method = RequestMethod.GET)
    public RestResponse editPage(@PathVariable("id") int id) {
        return new RestResponse(placeService.getById(id));
    }

    @ RequestMapping(value = "/places/edit", method = RequestMethod.POST)
    public RestResponse editPlace(@RequestBody Place place) {
        placeService.edit(place);
        return new RestResponse();
    }

    @ RequestMapping(value = "/places/add", method = RequestMethod.POST)
    public RestResponse addPlace(@RequestBody Place place) {
        placeService.add(place);
        return new RestResponse();
    }

    @ RequestMapping(value = "/places/delete/{id}", method = RequestMethod.GET)
    public RestResponse deletePlace(@PathVariable("id") int id) {
        Place place = placeService.getById(id);
        placeService.delete(place);
        return new RestResponse();
    }
}
