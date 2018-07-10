package com.example.biro.udacitygdcsabnd_tourguideapp;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.biro.udacitygdcsabnd_tourguideapp.CityFragments.CityFragmentPageAdapter;
import com.example.biro.udacitygdcsabnd_tourguideapp.ListAdapter.PlacesListAdapter;
import com.example.biro.udacitygdcsabnd_tourguideapp.PlaceFragments.CultureFragment;
import com.example.biro.udacitygdcsabnd_tourguideapp.PlaceFragments.HotelFragment;
import com.example.biro.udacitygdcsabnd_tourguideapp.PlaceFragments.PlaceFragmentPageAdapter;
import com.example.biro.udacitygdcsabnd_tourguideapp.PlaceFragments.RestaurantFragment;
import com.example.biro.udacitygdcsabnd_tourguideapp.Utils.Place;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    private String activity_title;

    private PlaceFragmentPageAdapter mPlaceFragmentPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        setActivityTitle();
        createViewPager();
    }

    private void createViewPager() {

        mPlaceFragmentPageAdapter = new PlaceFragmentPageAdapter(getSupportFragmentManager());

        mViewPager = findViewById(R.id.places_view_pager);
        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(mViewPager, true);

    }

    private void setupViewPager(ViewPager mViewPager) {
        PlaceFragmentPageAdapter adapter = new PlaceFragmentPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new RestaurantFragment(), "Restaurant");
        adapter.addFragment(new HotelFragment(), "Hotel");
        adapter.addFragment(new CultureFragment(), "Culture");
        mViewPager.setAdapter(adapter);
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
