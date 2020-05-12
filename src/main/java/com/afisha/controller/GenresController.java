package com.afisha.controller;

import com.afisha.model.Genre;
import com.afisha.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GenresController{

        private GenreService genreService;

        @Autowired
        public void setGenreService(GenreService genreService) {
            this.genreService = genreService;
        }

        //Получаем список жанров из сервиса и добавляем его в модель
        @RequestMapping(value = "/genres", method = RequestMethod.GET)
        public RestResponse allGenres() {
            return new RestResponse(genreService.allGenres());
        }


        @ RequestMapping(value = "/genres/edit/{id}", method = RequestMethod.GET)
        public RestResponse editPage(@PathVariable("id") int id) {
            return new RestResponse(genreService.getById(id));
        }

        @ RequestMapping(value = "/genres/edit", method = RequestMethod.POST)
        public RestResponse editEvent(@RequestBody Genre genre) {
            genreService.edit(genre);
            return new RestResponse();
        }

        @ RequestMapping(value = "/genres/add", method = RequestMethod.POST)
        public RestResponse addGenre(@RequestBody Genre genre) {
            genreService.add(genre);
            return new RestResponse();
        }

        @ RequestMapping(value = "/genres/delete/{id}", method = RequestMethod.GET)
        public RestResponse deleteGenre(@PathVariable("id") int id) {
            Genre genre = genreService.getById(id);
            genreService.delete(genre);
            return new RestResponse();
        }
}
