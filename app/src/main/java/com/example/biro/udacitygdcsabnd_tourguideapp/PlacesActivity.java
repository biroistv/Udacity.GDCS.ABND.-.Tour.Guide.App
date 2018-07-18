package com.example.biro.udacitygdcsabnd_tourguideapp;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.biro.udacitygdcsabnd_tourguideapp.PlaceFragments.CultureFragment;
import com.example.biro.udacitygdcsabnd_tourguideapp.PlaceFragments.HotelFragment;
import com.example.biro.udacitygdcsabnd_tourguideapp.PlaceFragments.PlaceFragmentPageAdapter;
import com.example.biro.udacitygdcsabnd_tourguideapp.PlaceFragments.RestaurantFragment;

public class PlacesActivity extends AppCompatActivity {

    private String activity_title;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        setActivityTitle();
        setupViewPager();
    }

    /**
     *  Setting up the fragment page adapter with tab layout in the places layout
     * */
    private void setupViewPager() {

        PlaceFragmentPageAdapter mPlaceFragmentPageAdapter = new PlaceFragmentPageAdapter(getSupportFragmentManager());

        mViewPager = findViewById(R.id.places_view_pager);
        mPlaceFragmentPageAdapter.addFragment(new RestaurantFragment(), getString(R.string.restaurant));
        mPlaceFragmentPageAdapter.addFragment(new HotelFragment(), getString(R.string.hotel));
        mPlaceFragmentPageAdapter.addFragment(new CultureFragment(), getString(R.string.culture));
        mViewPager.setAdapter(mPlaceFragmentPageAdapter);

        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(mViewPager, true);
    }


    /**
     *  Setting up the name of the page with the correct city name
     * */
    private void setActivityTitle() {
        getNameFromIntent();
        setTitle(activity_title + getString(R.string.places_suffix));
    }

    /**
     *  Getting the city name from the intent extra data
     * */
    private void getNameFromIntent() {
        Intent intent = getIntent();
        activity_title = intent.getStringExtra("city_name");
    }

}
