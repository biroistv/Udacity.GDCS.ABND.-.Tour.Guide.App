package com.example.biro.udacitygdcsabnd_tourguideapp.Utils;

import java.io.Serializable;

public class Place implements Serializable {

    private String placeName;
    private String placeAdress;
    private int placeType;
    private Integer placePictureID;

    public Place(String placeName, String placeAdress, int placeType, int placePictureID) {
        this.placeName = placeName;
        this.placeAdress = placeAdress;
        this.placeType = placeType;
        this.placePictureID = placePictureID;
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
    public Integer getPlacePictureID() { return placePictureID; }
}
