package com.example.biro.udacitygdcsabnd_tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.biro.udacitygdcsabnd_tourguideapp.Utils.Place;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    private String activity_title;
    private ArrayList<Place> places_array_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        getExtraFromIntent();
        setActivityTitle();
    }

    private void getExtraFromIntent() {
        Intent intent = getIntent();

        activity_title = intent.getStringExtra("city_name");
        places_array_list = (ArrayList<Place>) intent.getSerializableExtra("places_list");
    }

    private void setActivityTitle() {
        setTitle(activity_title + " places");
    }
}
