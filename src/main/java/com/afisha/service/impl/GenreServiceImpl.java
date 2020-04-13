package com.afisha.service.impl;

import com.afisha.dao.GenreDAO;
import com.afisha.model.Genre;
import com.afisha.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {
    private GenreDAO genreDAO;

    @Autowired
    public void setGenreDAO(GenreDAO genreDAO) {
        this.genreDAO = genreDAO;
    }

    @Transactional
    public List<Genre> allGenres() {
        return genreDAO.allGenres();
    }

    @Transactional
    public void add(Genre genre) {
        genreDAO.add(genre);
    }

    @Transactional
    public void delete(Genre genre) {
        genreDAO.delete(genre);
    }

    @Transactional
    public void edit(Genre genre) {
        genreDAO.edit(genre);
    }

    @Transactional
    public Genre getById(int id_genre) {
        return genreDAO.getById(id_genre);
    }
}
