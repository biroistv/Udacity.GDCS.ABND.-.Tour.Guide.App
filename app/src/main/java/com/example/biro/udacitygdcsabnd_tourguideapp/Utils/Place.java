package com.example.biro.udacitygdcsabnd_tourguideapp.Utils;

public class Place {

    private String placeName;
    private String placeAdress;
    private String placeType;
    private Integer placeTypePicturResourceID;

    public Place(String placeName, String placeAdress, String placeType, Integer placeTypePicturResourceID) {
        this.placeName = placeName;
        this.placeAdress = placeAdress;
        this.placeType = placeType;
        this.placeTypePicturResourceID = placeTypePicturResourceID;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceAdress() {
        return placeAdress;
    }

    public String getPlaceType() {
        return placeType;
    }

    public Integer getPlaceTypePicturResourceID() {
        return placeTypePicturResourceID;
    }
}
