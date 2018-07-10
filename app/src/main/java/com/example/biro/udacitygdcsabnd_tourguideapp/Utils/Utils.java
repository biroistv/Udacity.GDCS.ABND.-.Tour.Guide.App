package com.example.biro.udacitygdcsabnd_tourguideapp.Utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.biro.udacitygdcsabnd_tourguideapp.MainActivity;
import com.example.biro.udacitygdcsabnd_tourguideapp.PlacesActivity;
import com.example.biro.udacitygdcsabnd_tourguideapp.R;

import org.w3c.dom.Text;

public class Utils {

    public static City getCityFromResource(Context context, int pos) {

        String[] strCities = context.getResources().getStringArray(R.array.cities);
        String[] splitStr = strCities[pos].split("#");

        return new City(
                Integer.parseInt(splitStr[0]),
                splitStr[1],
                setCityImage(context, splitStr[2]),
                splitStr[3],
                null);
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

    public static void setupTheLayout(View view, final City city, final Activity activity)
    {
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
                intent.putExtra("places_list", city.getCityPlaces());
                intent.putExtra("city_name", city.getCityName());
                activity.startActivity(intent);
            }
        });
    }
}
