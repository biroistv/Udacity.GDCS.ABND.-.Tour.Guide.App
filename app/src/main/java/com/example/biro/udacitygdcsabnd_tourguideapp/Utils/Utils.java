package com.example.biro.udacitygdcsabnd_tourguideapp.Utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.biro.udacitygdcsabnd_tourguideapp.ListAdapter.PlacesListAdapter;
import com.example.biro.udacitygdcsabnd_tourguideapp.PlacesActivity;
import com.example.biro.udacitygdcsabnd_tourguideapp.R;

import java.util.ArrayList;

public class Utils {

    public static City getCityFromResource(Context context, int pos) {

        String[] strCities = context.getResources().getStringArray(R.array.cities);
        String[] splitStr = strCities[pos].split("#");

        return new City(
                Integer.parseInt(splitStr[0]),
                splitStr[1],
                setCityImage(context, splitStr[2]),
                splitStr[3],
                getLocationsFromResource(context, Integer.parseInt(splitStr[0])));
    }

    private static ArrayList<Place> getLocationsFromResource(Context context, int city_id) {
        ArrayList<Place> places = new ArrayList<>();

        String[] strPlaces = context.getResources().getStringArray(R.array.places);

        for (String place : strPlaces) {

            String[] splitPlace = place.split("#");

            if (Integer.parseInt(splitPlace[0]) == city_id) {
                places.add(
                        new Place(
                                splitPlace[2],
                                splitPlace[3],
                                Integer.parseInt(splitPlace[1])
                        ));
            }
        }

        return places;
    }

    private static Integer setCityImage(Context context, String imgName) {
        Integer imgResID;

        try {
            imgResID = context.getResources().getIdentifier(imgName, "mipmap", context.getPackageName());
        } catch (NullPointerException nullExc) {
            imgResID = null;
        }

        return imgResID;
    }

    public static void setupCityFragmentLayout(View view, final City city, final Activity activity) {
        ImageView img = view.findViewById(R.id.city_img);
        img.setImageResource(city.getCityPictureResourceID());

        TextView city_name = view.findViewById(R.id.city_name);
        city_name.setText(city.getCityName());

        TextView city_description = view.findViewById(R.id.city_information_text);
        city_description.setText(city.getDescription());

        Button button = view.findViewById(R.id.browse_places_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, PlacesActivity.class);
                intent.putExtra("places_item", city.getCityPlaces());
                intent.putExtra("city_name", city.getCityName());
                activity.startActivity(intent);
            }
        });
    }

    public static void setupPlacesFragmentLayout(View view, ArrayList<Place> placeArrayList, Activity activity, int type)
    {
        ArrayList<Place> filteredPlaces = new ArrayList<>();

        for (Place p : placeArrayList) {
            if (p.getPlaceType() == type)
                filteredPlaces.add(p);
        }

        PlacesListAdapter placesListAdapter = new PlacesListAdapter(activity, filteredPlaces);
        ListView lv = view.findViewById(R.id.places_list_view);
        lv.setAdapter(placesListAdapter);
    }
}
