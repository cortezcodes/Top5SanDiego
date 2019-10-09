package com.example.android.top5sandiego;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Custom PagerAdapter class used as the adapter for the ViewPager in the MainActivity
 */
public class CustomPagerAdapter extends FragmentPagerAdapter {
    //pass the context in which CustomPagerAdapter is being used
    private Context mContext;

    //Number of Pages that should be swipeable
    private static final int NUMBER_OF_PAGES = 4;

    /**
     * Constructor that only takes in a Context variable
     * @param context context in which the CustomPagerAdapter is being used
     */
    public CustomPagerAdapter(FragmentManager fm, Context context){
        super(fm);
        mContext = context;
    }

    /**
     * Required overridden class for any extension of FragmentPagerAdapter. Returns the number of
     * pages expected to be apart of the PageAdapter
     */
    @Override
    public int getCount(){
        return NUMBER_OF_PAGES;
    }

    /**
     * Required overridden Class for any extension of FragmentPagerAdapter. Returns the correct
     * fragment based of position
     * @param position location in the stack of the current Fragment.
     */
    @Override
    public Fragment getItem(int position){
        switch(position){
            case 0: return new EatsFragment();
            case 1: return new NightLifeFragment();
            case 2: return new HotelsFragment();
            default: return new LandmarksFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch(position){
            case 0: return "Eats";
            case 1: return "Night Life";
            case 2: return "Hotels";
            default: return "Landmarks";
        }
    }

}
