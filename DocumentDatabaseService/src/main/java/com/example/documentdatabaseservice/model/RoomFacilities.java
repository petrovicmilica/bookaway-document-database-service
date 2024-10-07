package com.example.documentdatabaseservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "roomFacilities")
public class RoomFacilities {
    @Id
    private String id;

    @Field(name = "size")
    private Integer size;

    @Field(name = "view")
    private boolean view;

    @Field(name = "air_conditioning")
    private boolean air_conditioning;

    @Field(name = "ensuite_bathroom")
    private boolean ensuite_bathroom;

    @Field(name = "soundproofing")
    private boolean soundproofing;

    @Field(name = "minibar")
    private boolean minibar;

    @Field(name = "free_wifi")
    private boolean free_wifi;

    @Field(name = "other_facilities")
    private String other_facilities;

    @Field(name = "room_id")
    private String room_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public boolean isView() {
        return view;
    }

    public void setView(boolean view) {
        this.view = view;
    }

    public boolean isAir_conditioning() {
        return air_conditioning;
    }

    public void setAir_conditioning(boolean air_conditioning) {
        this.air_conditioning = air_conditioning;
    }

    public boolean isEnsuite_bathroom() {
        return ensuite_bathroom;
    }

    public void setEnsuite_bathroom(boolean ensuite_bathroom) {
        this.ensuite_bathroom = ensuite_bathroom;
    }

    public boolean isSoundproofing() {
        return soundproofing;
    }

    public void setSoundproofing(boolean soundproofing) {
        this.soundproofing = soundproofing;
    }

    public boolean isMinibar() {
        return minibar;
    }

    public void setMinibar(boolean minibar) {
        this.minibar = minibar;
    }

    public boolean isFree_wifi() {
        return free_wifi;
    }

    public void setFree_wifi(boolean free_wifi) {
        this.free_wifi = free_wifi;
    }

    public String getOther_facilities() {
        return other_facilities;
    }

    public void setOther_facilities(String other_facilities) {
        this.other_facilities = other_facilities;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }
}
