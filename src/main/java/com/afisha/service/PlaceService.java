package com.afisha.service;

import com.afisha.model.Place;

import java.util.List;

public interface PlaceService {
    List<Place> allPlaces();
    void add(Place place);
    void delete(Place place);
    void edit(Place place);
    Place getById(int id_place);
}
