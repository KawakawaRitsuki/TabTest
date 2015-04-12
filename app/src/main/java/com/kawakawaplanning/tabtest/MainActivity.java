package com.kawakawaplanning.tabtest;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity {

    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp = (ViewPager)findViewById(R.id.mypager);//定義
        vp.setAdapter(new PAdapter(this.getSupportFragmentManager()));//アダプタ入れる
        vp.setCurrentItem(2);
    }

}
