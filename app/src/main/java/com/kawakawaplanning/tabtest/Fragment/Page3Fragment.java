package com.kawakawaplanning.tabtest.Fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.kawakawaplanning.tabtest.R;

/**
 * Created by KP on 2015/03/25.
 */
public class Page3Fragment extends Fragment implements View.OnClickListener{

    Button btn;

    public Page3Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_page3, container, false);
        btn = (Button)v.findViewById(R.id.Button);
        btn.setOnClickListener(this);
        return v;

    }

    @Override
    public void onClick(View v) {
        Uri uri = Uri.parse("https://github.com/KawakawaRitsuki/TabTest");
        Intent i = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }
}
