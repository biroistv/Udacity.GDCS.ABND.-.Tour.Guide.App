package com.example.biro.udacitygdcsabnd_tourguideapp.Utils;

public class City {

    private int cityID;
    private String cityName;
    private Integer cityPictureResourceID;

    City(int cityID, String cityName, Integer cityPictureResourceID) {
        this.cityID = cityID;
        this.cityName = cityName;
        this.cityPictureResourceID = cityPictureResourceID;
    }

    public String getCityName() {
        return cityName;
    }
    public int getCityID() {
        return cityID;
    }
    public Integer getCityPictureResourceID() {
        return cityPictureResourceID;
    }
}
