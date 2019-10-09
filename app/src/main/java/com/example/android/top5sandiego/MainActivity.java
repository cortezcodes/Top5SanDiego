package com.example.android.top5sandiego;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    ViewPager mViewPager;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    CustomPagerAdapter pagerAdapter;

    /**
     *The TabLayout, which gives the title of each fragment
     */
    TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiate a ViewPager
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        pagerAdapter = new CustomPagerAdapter(getSupportFragmentManager(), this);
        mViewPager.setAdapter(pagerAdapter);

        //Instantiate a TabLayout for each Fragment
        mTabLayout = findViewById(R.id.sliding_tabs);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
