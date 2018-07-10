package com.example.biro.udacitygdcsabnd_tourguideapp.Utils;

import java.io.Serializable;

public class Place implements Serializable {

    private String placeName;
    private String placeAdress;
    private int placeType;

    public Place(String placeName, String placeAdress, int placeType) {
        this.placeName = placeName;
        this.placeAdress = placeAdress;
        this.placeType = placeType;
    }

    public String getPlaceName() {
        return placeName;
    }
    public String getPlaceAdress() {
        return placeAdress;
    }
    public int getPlaceType() {
        return placeType;
    }
}
