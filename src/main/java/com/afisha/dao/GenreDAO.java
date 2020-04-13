package com.afisha.dao;

import com.afisha.model.Genre;

import java.util.List;

public interface GenreDAO {
    List<Genre> allGenres();
    void add(Genre genre);
    void delete(Genre genre);
    void edit(Genre genre);
    Genre getById(int id_genre);
}
