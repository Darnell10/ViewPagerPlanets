package com.example.viewpagerplanets.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class ViewAdapter extends FragmentPagerAdapter {

    private List<Fragment> plantFragments;


    public ViewAdapter(FragmentManager fm, List<Fragment> plantFragments) {
        super(fm);
        this.plantFragments = plantFragments;
    }

    @Override
    public Fragment getItem(int i) {
        return plantFragments.get(i);
    }

    @Override
    public int getCount() {
        return plantFragments.size();
    }
}
