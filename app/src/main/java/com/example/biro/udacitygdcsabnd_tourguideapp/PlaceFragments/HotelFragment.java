package com.example.biro.udacitygdcsabnd_tourguideapp.PlaceFragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.biro.udacitygdcsabnd_tourguideapp.R;
import com.example.biro.udacitygdcsabnd_tourguideapp.Utils.Place;
import com.example.biro.udacitygdcsabnd_tourguideapp.Utils.Utils;

import java.util.ArrayList;

public class HotelFragment extends Fragment {

    private ArrayList<Place> places;

    public HotelFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.places_fragment_layout, container, false);
        Utils.setupPlacesFragmentLayout(view, places, getActivity(), 1);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getActivity().getIntent();

        places = (ArrayList<Place>) intent.getSerializableExtra("places_item");
    }

    @Nullable
    @Override
    public Context getContext() {
        return super.getContext();
    }
}
