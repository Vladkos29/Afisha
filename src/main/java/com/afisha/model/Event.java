package com.afisha.model;

import javax.persistence.*;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @Column(name = "id_event")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_event;

    @Column(name = "name_event")
    private String name_event;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "genre_event")
    private Genre genre_event;

    @Column(name = "datetime_start_event")
    private long datetime_start_event;

    @Column(name = "datetime_end_event")
    private long datetime_end_event;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "location")
    private Place location;

    @Column(name = "metadata_event")
    private String metadata_event;

    @Column(name = "adults_only")
    private int adults_only;

    @Column(name = "active")
    private int active;

    @Column(name = "rating_event")
    private int rating;


    public int getId() {
        return id_event;
    }

    public void setId(int id) {
        this.id_event = id;
    }

    public String getName_event() {
        return name_event;
    }

    public void setName_event(String name_event) {
        this.name_event = name_event;
    }

    public Genre getGenre_event() {
        return genre_event;
    }

    public void setGenre_event(Genre genre_event) {
        this.genre_event = genre_event;
    }

    public long getDatetime_start_event() {
        return datetime_start_event;
    }

    public void setDatetime_start_event(long datetime_start_event) {
        this.datetime_start_event = datetime_start_event;
    }

    public long getDatetime_end_event() {
        return datetime_end_event;
    }

    public void setDatetime_end_event(long datetime_end_event) {
        this.datetime_end_event = datetime_end_event;
    }

    public Place getLocation() {
        return location;
    }

    public void setLocation(Place location) {
        this.location = location;
    }

    public String getMetadata_event() {
        return metadata_event;
    }

    public void setMetadata_event(String metadata_event) {
        this.metadata_event = metadata_event;
    }

    public int getAdults_only() {
        return adults_only;
    }

    public void setAdults_only(int adults_only) {
        this.adults_only = adults_only;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
