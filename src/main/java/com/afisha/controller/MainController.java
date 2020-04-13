package com.afisha.controller;

import com.afisha.model.Event;
import com.afisha.model.Genre;
import com.afisha.model.Place;
import com.afisha.service.EventService;
import com.afisha.service.GenreService;
import com.afisha.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {
    private PlaceService placeService;
    private GenreService genreService;
    private EventService eventService;

    @Autowired
    public void setPlaceService(PlaceService placeService) {
        this.placeService = placeService;
    }

    @Autowired
    public void setGenreService(GenreService genreService) {
        this.genreService = genreService;
    }

    @Autowired
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    //Получаем список мест из сервиса и добавляем его в модель
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView allPlaces() {
        List<Place> places = placeService.allPlaces();
        //List<Genre> genres = genreService.allGenres();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        modelAndView.addObject("placesList", places);
        //modelAndView.addObject("genresList", genres);
        return modelAndView;
    }


    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPage(@PathVariable("id") int id) {
        Place place = placeService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        modelAndView.addObject("place", place);
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editPlace(@ModelAttribute("place") Place place) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        placeService.edit(place);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addPlace(@ModelAttribute("place") Place place) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        placeService.add(place);
        return modelAndView;
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deletePlace(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        Place place = placeService.getById(id);
        placeService.delete(place);
        return modelAndView;
    }

    @RequestMapping(value = "/genre", method = RequestMethod.GET)
    public ModelAndView allGenres() {
        List<Genre> genres = genreService.allGenres();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        modelAndView.addObject("genresList", genres);
        return modelAndView;
    }

    @RequestMapping(value = "/event", method = RequestMethod.GET)
    public ModelAndView allEvents() {
        List<Event> events = eventService.allEvents();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        modelAndView.addObject("eventsList", events);
        return modelAndView;
    }
}
