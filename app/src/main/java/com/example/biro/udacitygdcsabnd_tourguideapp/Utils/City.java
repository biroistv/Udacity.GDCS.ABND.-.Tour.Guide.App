package com.example.biro.udacitygdcsabnd_tourguideapp.Utils;

public class City {

    private int c_ID_;
    private String c_Name_;
    private Integer c_Picture_ID_;

    public City(int c_ID_, String c_Name_, Integer c_Picture_ID_) {
        this.c_ID_ = c_ID_;
        this.c_Name_ = c_Name_;
        this.c_Picture_ID_ = c_Picture_ID_;
    }

    public String getC_Name_() {
        return c_Name_;
    }

    public int getC_ID_() {
        return c_ID_;
    }

    public Integer getC_Picture_ID_() {
        return c_Picture_ID_;
    }
}
