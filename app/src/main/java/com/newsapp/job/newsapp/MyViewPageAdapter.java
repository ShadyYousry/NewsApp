package com.newsapp.job.newsapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shady on 3/10/2018.
 */

public  class MyViewPageAdapter extends FragmentPagerAdapter {
    private List<Fragment> myFragment = new ArrayList<>();
    private List<String> myPageTitle = new ArrayList<>();

    public MyViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    public void AddFragmentPage(Fragment frag,String title){
        myFragment.add(frag);
        myPageTitle.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return myFragment.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return myPageTitle.get(position);
    }


    @Override
    public int getCount() {
        return 3;
    }
}
