package com.example.biro.udacitygdcsabnd_tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final ArrayList<City> city_ = new ArrayList<City>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoAddCities();
        createListView();

    }

    private void createListView()
    {
        CityAdapter cAdapter = new CityAdapter(this, city_);
        ListView lView = findViewById(R.id.city_list);
        lView.setAdapter(cAdapter);
    }

    private ArrayList<City> autoAddCities()
    {
        String[] strCities = this.getResources().getStringArray(R.array.cities);

        for (String str: strCities)
        {
            String[] splitStr = str.split("#");

            city_.add(new City(
                    Integer.parseInt(splitStr[0]),
                    splitStr[1],
                    R.mipmap.nyiregy1)
            );
        }



        return null;
    }
}
