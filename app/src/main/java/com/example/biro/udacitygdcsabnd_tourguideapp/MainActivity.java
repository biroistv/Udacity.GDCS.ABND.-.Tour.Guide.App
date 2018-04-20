package com.example.biro.udacitygdcsabnd_tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    final ArrayList<City> city_ = new ArrayList<City>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        city_.add(new City("Nyíregyháza", R.mipmap.nyiregy1));

        CityAdapter cAdapter = new CityAdapter(this, city_);

        ListView lView = (ListView)findViewById(R.id.city_list);

        lView.setAdapter(cAdapter);

    }
}
