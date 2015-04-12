package com.kawakawaplanning.tabtest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.kawakawaplanning.tabtest.Fragment.Page1Fragment;
import com.kawakawaplanning.tabtest.Fragment.Page2Fragment;
import com.kawakawaplanning.tabtest.Fragment.Page3Fragment;
import com.kawakawaplanning.tabtest.Fragment.Page4Fragment;
import com.kawakawaplanning.tabtest.Fragment.Page5Fragment;


/**
 * Created by KP on 2015/03/25.
 */
public class PAdapter extends FragmentPagerAdapter {

    public PAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:return new Page1Fragment();
            case 1:return new Page2Fragment();
            case 2:return new Page3Fragment();
            case 3:return new Page4Fragment();
            case 4:return new Page5Fragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
    @Override
    public CharSequence getPageTitle(int position){
        switch(position){
            case 0:return "Page1";
            case 1:return "Page2";
            case 2:return "Page3";
            case 3:return "Page4";
            case 4:return "Page5";
        }
        return null;
    }
}
