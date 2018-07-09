package com.example.biro.udacitygdcsabnd_tourguideapp.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.biro.udacitygdcsabnd_tourguideapp.R;
import com.example.biro.udacitygdcsabnd_tourguideapp.Utils.City;
import com.example.biro.udacitygdcsabnd_tourguideapp.Utils.Utils;

public class DebrecenFragment extends Fragment {

    private City debrecen;

    public DebrecenFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.city_fragment_layout, container, false);
        Utils.setupTheLayout(view, debrecen);

        return view;
    }

    @Nullable
    @Override
    public Context getContext() {
        return super.getContext();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        debrecen = Utils.getCityFromResource(getContext(), 1);
    }
}
