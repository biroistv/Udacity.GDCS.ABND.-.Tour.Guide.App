package com.example.biro.udacitygdcsabnd_tourguideapp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.biro.udacitygdcsabnd_tourguideapp.CityFragments.CityFragmentPageAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createViewPager();
    }

    private void createViewPager() {
        ViewPager viewPager = findViewById(R.id.main_layout_view_pager);
        CityFragmentPageAdapter adapter = new CityFragmentPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}
