package com.example.biro.udacitygdcsabnd_tourguideapp.ListAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import com.example.biro.udacitygdcsabnd_tourguideapp.Utils.Place;

import java.util.List;

public class PlacesListAdapter extends ArrayAdapter<Place>{
    public PlacesListAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Place> objects) {
        super(context, resource, textViewResourceId, objects);
    }
}
