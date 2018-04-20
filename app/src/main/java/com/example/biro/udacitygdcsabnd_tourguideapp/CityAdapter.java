package com.example.biro.udacitygdcsabnd_tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CityAdapter extends ArrayAdapter<City> {

    private static final String LOG_TAG = CityAdapter.class.getSimpleName();

    public CityAdapter(Activity context, ArrayList<City> city)
    {
        super(context, 0, city);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listOfViews = convertView;

        if(listOfViews == null) {
            listOfViews = LayoutInflater.from(getContext()).inflate(
                    R.layout.city_list_item, parent, false);
        }

        City c = getItem(position);

        ((TextView)listOfViews.findViewById(R.id.city_name)).setText(c.getC_Name_());
        ((ImageView)listOfViews.findViewById(R.id.city_img)).setImageResource(c.getC_Picture_ID_());

        return listOfViews;
    }
}
