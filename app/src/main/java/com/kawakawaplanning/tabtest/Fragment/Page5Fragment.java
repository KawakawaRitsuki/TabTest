package com.kawakawaplanning.tabtest.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kawakawaplanning.tabtest.R;

/**
 * Created by KP on 2015/03/25.
 */
public class Page5Fragment extends Fragment {


    public Page5Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_page5, container, false);
        return v;

    }

}
