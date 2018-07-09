package com.example.biro.udacitygdcsabnd_tourguideapp.Utils;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.biro.udacitygdcsabnd_tourguideapp.MainActivity;
import com.example.biro.udacitygdcsabnd_tourguideapp.R;

import java.util.ArrayList;

public class Utils {

    public static City getCityFromResource(Context context, int pos) {

        String[] strCities = context.getResources().getStringArray(R.array.cities);
        String[] splitStr = strCities[pos].split("#");

        return new City(
                Integer.parseInt(splitStr[0]),
                splitStr[1],
                setCityImage(context, splitStr[2]));
    }

    private static Integer setCityImage(Context context, String imgName) {
        Integer imgResID;

        try {
            imgResID = new Integer(context.getResources().getIdentifier(imgName.toString(), "mipmap", context.getPackageName()));
        } catch (NullPointerException nullExc) {
            imgResID = null;
        }

        return imgResID;
    }

    public static void setupTheLayout(View view, City city)
    {
        ImageView img = (ImageView) view.findViewById(R.id.city_img);
        img.setImageResource(city.getC_Picture_ID_());

        TextView city_name = (TextView) view.findViewById(R.id.city_name);
        city_name.setText(city.getC_Name_());
    }
}
