package com.example.biro.udacitygdcsabnd_tourguideapp.Utils;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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

    public static void setupTheLayout(View view, City city)
    {
        ImageView img = view.findViewById(R.id.city_img);
        img.setImageResource(city.getCityPictureResourceID());

        TextView city_name = view.findViewById(R.id.city_name);
        city_name.setText(city.getCityName());

        TextView city_description = view.findViewById(R.id.city_information_text);
        city_description.setText(city.getDescription());
    }
}
