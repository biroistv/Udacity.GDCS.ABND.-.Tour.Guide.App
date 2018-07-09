package com.example.biro.udacitygdcsabnd_tourguideapp.FragmentAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.biro.udacitygdcsabnd_tourguideapp.Fragments.BudapestFragment;
import com.example.biro.udacitygdcsabnd_tourguideapp.Fragments.DebrecenFragment;
import com.example.biro.udacitygdcsabnd_tourguideapp.Fragments.NyiregyhazaFragment;

public class CityFragmentPageAdapter extends FragmentPagerAdapter {

    private static final int NUMBER_OF_CITY = 3;

    public CityFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                return new NyiregyhazaFragment();
            }
            case 1: {
                return new DebrecenFragment();
            }
            case 2: {
                return new BudapestFragment();
            }
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return NUMBER_OF_CITY;
    }
}
