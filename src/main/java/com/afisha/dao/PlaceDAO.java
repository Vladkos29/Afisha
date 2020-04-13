package com.afisha.dao;

import com.afisha.model.Place;

import java.util.List;

public interface PlaceDAO {
    List<Place> allPlaces();
    void add(Place place);
    void delete(Place place);
    void edit(Place place);
    Place getById(int id_place);
}
