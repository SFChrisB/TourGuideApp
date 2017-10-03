package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public SimpleFragmentPagerAdapter(Context c, FragmentManager fm) {
        super(fm);
        context = c;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumsFragment();
        } else if (position == 1){
            return new RestaurantsFragment();
        } else if (position == 2){
            return new AttractionsFragment();
        } else {
            return new BarsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    // Viewpager bar
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_museums);
        } else if (position == 1) {
            return context.getString(R.string.category_restaurants);
        } else if (position == 2) {
            return context.getString(R.string.category_attractions);
        } else {
            return context.getString(R.string.category_bars);
        }
    }
}
