package com.example.biro.udacitygdcsabnd_tourguideapp;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.biro.udacitygdcsabnd_tourguideapp.FragmentAdapter.CityFragmentPageAdapter;
import com.example.biro.udacitygdcsabnd_tourguideapp.Utils.City;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createViewPager();

    }

    private void createViewPager() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.main_layout_view_pager);
        CityFragmentPageAdapter adapter = new CityFragmentPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}
