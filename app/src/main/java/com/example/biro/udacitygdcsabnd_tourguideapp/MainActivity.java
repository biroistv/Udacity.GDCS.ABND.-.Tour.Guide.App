package com.example.biro.udacitygdcsabnd_tourguideapp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.biro.udacitygdcsabnd_tourguideapp.CityFragments.BudapestFragment;
import com.example.biro.udacitygdcsabnd_tourguideapp.CityFragments.CityFragmentPageAdapter;
import com.example.biro.udacitygdcsabnd_tourguideapp.CityFragments.DebrecenFragment;
import com.example.biro.udacitygdcsabnd_tourguideapp.CityFragments.NyiregyhazaFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViewPager();
    }

    /**
     *  Setting up the fragment page adapter in the cities layout
     * */
    private void setupViewPager() {
        ViewPager viewPager = findViewById(R.id.main_layout_view_pager);
        CityFragmentPageAdapter adapter = new CityFragmentPageAdapter(getSupportFragmentManager());

        adapter.addFragment(new NyiregyhazaFragment());
        adapter.addFragment(new DebrecenFragment());
        adapter.addFragment(new BudapestFragment());

        viewPager.setAdapter(adapter);
    }
}
