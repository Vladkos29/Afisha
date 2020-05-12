package com.afisha.model;

import javax.persistence.*;

@Entity
@Table(name = "events_users_request")
public class UserRequest {

    @Id
    @Column(name = "id_request")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_request;

    @Column(name = "name_user_event")
    private String name_user_event;

    @ManyToOne(fetch=FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_genre_user_event")
    private Genre id_genre_user_event;

    @Column(name = "datetime_start")
    private long datetime_start;

    @Column(name = "datetime_end")
    private long datetime_end;

    @Column(name = "city_user_event")
    private String city_user_event;

    @Column(name = "street_user_event")
    private String street_user_event;

    @Column(name = "building_user_event")
    private String building_user_event;

    @Column(name = "metadata_user_event")
    private String metadata_user_event;

    @Column(name = "adults_only_user_event")
    private int adults_only_user_event;

    @Column(name = "image_user_event")
    private String image_user_event;

    @Column(name = "id_user")
    private int id_user_request;

    @Column(name = "status_request")
        private int status_request;

    public int getId() {
        return id_request;
    }

    public void setId(int id_request) {
        this.id_request = id_request;
    }

    public String getName_user_event() {
        return name_user_event;
    }

    public void setName_user_event(String name_user_event) {
        this.name_user_event = name_user_event;
    }

    public Genre getId_genre_user_event() {
        return id_genre_user_event;
    }

    public void setId_genre_user_event(Genre id_genre_user_event) {
        this.id_genre_user_event = id_genre_user_event;
    }

    public long getDatetime_start() {
        return datetime_start;
    }

    public void setDatetime_start(long datetime_start) {
        this.datetime_start = datetime_start;
    }

    public long getDatetime_end() {
        return datetime_end;
    }

    public void setDatetime_end(long datetime_end) {
        this.datetime_end = datetime_end;
    }

    public String getCity_user_event() {
        return city_user_event;
    }

    public void setCity_user_event(String city_user_event) {
        this.city_user_event = city_user_event;
    }

    public String getStreet_user_event() {
        return street_user_event;
    }

    public void setStreet_user_event(String street_user_event) {
        this.street_user_event = street_user_event;
    }

    public String getBuilding_user_event() {
        return building_user_event;
    }

    public void setBuilding_user_event(String building_user_event) {
        this.building_user_event = building_user_event;
    }

    public String getMetadata_user_event() {
        return metadata_user_event;
    }

    public void setMetadata_user_event(String metadata_user_event) {
        this.metadata_user_event = metadata_user_event;
    }

    public int getAdults_only_user_event() {
        return adults_only_user_event;
    }

    public void setAdults_only_user_event(int adults_only_user_event) {
        this.adults_only_user_event = adults_only_user_event;
    }

    public String getImage_user_event() {
        return image_user_event;
    }

    public void setImage_user_event(String image_user_event) {
        this.image_user_event = image_user_event;
    }

    public int getId_user_request() {
        return id_user_request;
    }

    public void setId_user_request(int id_user_request) {
        this.id_user_request = id_user_request;
    }

    public int getStatus_request() {
        return status_request;
    }

    public void setStatus_request(int status_request) {
        this.status_request = status_request;
    }
}

