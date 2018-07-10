package com.example.biro.udacitygdcsabnd_tourguideapp.Utils;

import java.util.ArrayList;

public class City {

    private int cityID;
    private String cityName;
    private Integer cityPictureResourceID;
    private String description;
    private ArrayList<Place> cityPlaces;

    City(int cityID, String cityName, Integer cityPictureResourceID, String description, ArrayList<Place> cityPlaces) {
        this.cityID = cityID;
        this.cityName = cityName;
        this.cityPictureResourceID = cityPictureResourceID;
        this.description = description;
        this.cityPlaces = cityPlaces;
    }

    public String getCityName() {
        return cityName;
    }
    public int getCityID() { return cityID; }
    public Integer getCityPictureResourceID() {
        return cityPictureResourceID;
    }
    public String getDescription(){ return description; }
    public ArrayList<Place> getCityPlaces() { return cityPlaces; }
}
