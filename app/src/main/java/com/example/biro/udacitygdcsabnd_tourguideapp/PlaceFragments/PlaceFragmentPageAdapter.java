package com.example.biro.udacitygdcsabnd_tourguideapp.PlaceFragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.biro.udacitygdcsabnd_tourguideapp.R;

import java.util.ArrayList;
import java.util.List;

public class PlaceFragmentPageAdapter extends FragmentPagerAdapter{

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    public void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    public PlaceFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() { return mFragmentList.size(); }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return mFragmentTitleList.get(position);
    }
}
