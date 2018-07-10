package com.example.biro.udacitygdcsabnd_tourguideapp.PlaceFragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PlaceFragmentPageAdapter extends FragmentPagerAdapter{

    private static final int NUMBER_OF_LOCATION_TYPE = 3;

    public PlaceFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:{
                return new RestaurantFragment();
            }
            case 1:{
                return new HotelFragment();
            }
            case 2:{
                return new CultureFragment();
            }
            default: return null;
        }
    }

    @Override
    public int getCount() { return NUMBER_OF_LOCATION_TYPE; }
}
