package com.example.biro.udacitygdcsabnd_tourguideapp.FragmentAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.biro.udacitygdcsabnd_tourguideapp.Fragments.NyiregyhazaFragment;

public class CityFragmentPageAdapter extends FragmentPagerAdapter {

    public CityFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                return new NyiregyhazaFragment();
            }
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 1;
    }
}
