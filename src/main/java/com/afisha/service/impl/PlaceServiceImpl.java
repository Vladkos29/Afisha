package com.afisha.service.impl;

import com.afisha.dao.PlaceDAO;
import com.afisha.model.Place;
import com.afisha.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {
    private PlaceDAO placeDAO;

    @Autowired
    public void setPlaceDAO(PlaceDAO placeDAO) {
        this.placeDAO = placeDAO;
    }

    @Transactional
    public List<Place> allPlaces() {
        return placeDAO.allPlaces();
    }

    @Transactional
    public void add(Place place) {
        placeDAO.add(place);
    }

    @Transactional
    public void delete(Place place) {
        placeDAO.delete(place);
    }

    @Transactional
    public void edit(Place place) {
        placeDAO.edit(place);
    }

    @Transactional
    public Place getById(int id_place) {
        return placeDAO.getById(id_place);
    }
}