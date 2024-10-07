package com.example.documentdatabaseservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "hotelFacilities")
public class HotelFacilities {
    @Id
    private String id;

    @Field(name = "smoking_rooms")
    private boolean smoking_rooms;

    @Field(name = "disabled_guests")
    private boolean disabled_guests;

    @Field(name = "free_parking")
    private boolean free_parking;

    @Field(name = "free_wifi")
    private boolean free_wifi;

    @Field(name = "fitness_centre")
    private boolean fitness_centre;

    @Field(name = "airport_shuttle")
    private boolean airport_shuttle;

    @Field(name = "bar")
    private boolean bar;

    @Field(name = "breakfast")
    private boolean breakfast;

    @Field(name = "bathroom")
    private String bathroom;

    @Field(name = "bedroom")
    private String bedroom;

    @Field(name = "media_and_technology")
    private String media_and_technology;

    @Field(name = "food_and_drink")
    private String food_and_drink;

    @Field(name = "parking")
    private String parking;

    @Field(name = "safety")
    private String safety;

    @Field(name = "general")
    private String general;

    @Field(name = "languages")
    private String languages;

    @Field(name = "hotel_id")
    private String hotel_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isSmoking_rooms() {
        return smoking_rooms;
    }

    public void setSmoking_rooms(boolean smoking_rooms) {
        this.smoking_rooms = smoking_rooms;
    }

    public boolean isDisabled_guests() {
        return disabled_guests;
    }

    public void setDisabled_guests(boolean disabled_guests) {
        this.disabled_guests = disabled_guests;
    }

    public boolean isFree_parking() {
        return free_parking;
    }

    public void setFree_parking(boolean free_parking) {
        this.free_parking = free_parking;
    }

    public boolean isFree_wifi() {
        return free_wifi;
    }

    public void setFree_wifi(boolean free_wifi) {
        this.free_wifi = free_wifi;
    }

    public boolean isFitness_centre() {
        return fitness_centre;
    }

    public void setFitness_centre(boolean fitness_centre) {
        this.fitness_centre = fitness_centre;
    }

    public boolean isAirport_shuttle() {
        return airport_shuttle;
    }

    public void setAirport_shuttle(boolean airport_shuttle) {
        this.airport_shuttle = airport_shuttle;
    }

    public boolean isBar() {
        return bar;
    }

    public void setBar(boolean bar) {
        this.bar = bar;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    public String getBedroom() {
        return bedroom;
    }

    public void setBedroom(String bedroom) {
        this.bedroom = bedroom;
    }

    public String getMedia_and_technology() {
        return media_and_technology;
    }

    public void setMedia_and_technology(String media_and_technology) {
        this.media_and_technology = media_and_technology;
    }

    public String getFood_and_drink() {
        return food_and_drink;
    }

    public void setFood_and_drink(String food_and_drink) {
        this.food_and_drink = food_and_drink;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public String getSafety() {
        return safety;
    }

    public void setSafety(String safety) {
        this.safety = safety;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }
}
