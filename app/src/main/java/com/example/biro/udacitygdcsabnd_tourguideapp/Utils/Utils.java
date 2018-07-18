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

/**
 *  This class contains some helper methods.
 * */

public class Utils {

    /**
     *  With this method, i get the information for each city what is store in cities resource files.
     * */
    public static City getCityFromResource(Context context, int pos) {

        String[] strCities = context.getResources().getStringArray(R.array.cities);
        String[] splitStr = strCities[pos].split("#");

        return new City(
                Integer.parseInt(splitStr[0]),
                splitStr[1],
                getCityImage(context, splitStr[2]),
                splitStr[3],
                getLocationsFromResource(context, Integer.parseInt(splitStr[0])));
    }

    /**
     *  This methods get the places basic information what is store in the places.xml resource file.
     *  cityID represent the city, where i looking for the places.
     * */
    private static ArrayList<Place> getLocationsFromResource(Context context, int cityID) {
        ArrayList<Place> places = new ArrayList<>();

        // Get te resource from the resource library
        String[] strPlaces = context.getResources().getStringArray(R.array.places);

        // Iterate through the list
        for (String place : strPlaces) {

            // Split up one line at a time
            String[] splitPlace = place.split("#");

            // Add the places to the array list
            if (Integer.parseInt(splitPlace[0]) == cityID) {
                places.add(
                        new Place(
                                splitPlace[3],
                                splitPlace[4],
                                Integer.parseInt(splitPlace[1]),
                                getLocationImage(context, splitPlace[2])
                        ));
            }
        }

        return places;
    }

    /**
     *  This method get the valid picture id depend on the picture name.
     * */
    private static Integer getCityImage(Context context, String imgName) {
        Integer imgResID;

        try {
            imgResID = context.getResources().getIdentifier(imgName, "drawable", context.getPackageName());
        } catch (NullPointerException nullExc) {
            imgResID = null;
        }

        return imgResID;
    }

    /**
     *  This method get the valid picture id depend on the picture name.
     * */
    private static Integer getLocationImage(Context context, String imgName) {
        Integer imgResID;

        try {
            imgResID = context.getResources().getIdentifier(imgName, "drawable", context.getPackageName());
        } catch (NullPointerException nullExc) {
            imgResID = null;
        }

        return imgResID;
    }

    /**
     *  This helper method set up the layout what we see in the MainActivity. I use this in the city fragments.
     * */
    public static void setupCityFragmentLayout(View view, final City city, final Activity activity) {
        ImageView img = view.findViewById(R.id.city_img);
        img.setImageResource(city.getCityPictureResourceID());

        TextView cityName = view.findViewById(R.id.city_name);
        cityName.setText(city.getCityName());

        TextView cityDescription = view.findViewById(R.id.city_information_text);
        cityDescription.setText(city.getDescription());

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

    /**
     *  This helper method set up the layout what we see in the PLacesActivity. I use this in the places fragments.
     * */
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
