package com.example.biro.udacitygdcsabnd_tourguideapp;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.biro.udacitygdcsabnd_tourguideapp.CityFragments.CityFragmentPageAdapter;
import com.example.biro.udacitygdcsabnd_tourguideapp.ListAdapter.PlacesListAdapter;
import com.example.biro.udacitygdcsabnd_tourguideapp.PlaceFragments.PlaceFragmentPageAdapter;
import com.example.biro.udacitygdcsabnd_tourguideapp.Utils.Place;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    private String activity_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        setActivityTitle();
        createViewPager();
    }

    private void createViewPager() {
        ViewPager viewPager = findViewById(R.id.places_view_pager);
        PlaceFragmentPageAdapter adapter = new PlaceFragmentPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    private void setActivityTitle() {
        getNameFromIntent();
        setTitle(activity_title + " places");
    }

    private void getNameFromIntent() {
        Intent intent = getIntent();
        activity_title = intent.getStringExtra("city_name");
    }

}
