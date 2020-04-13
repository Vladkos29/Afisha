package com.afisha.service;

import com.afisha.model.Genre;

import java.util.List;

public interface GenreService {
    List<Genre> allGenres();
    void add(Genre genre);
    void delete(Genre genre);
    void edit(Genre genre);
    Genre getById(int id_genre);
}
