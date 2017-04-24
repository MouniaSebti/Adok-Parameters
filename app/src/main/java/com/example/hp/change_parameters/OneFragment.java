package com.example.hp.change_parameters;

import android.support.v4.app.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by hp on 20-04-2017.
 */

public class OneFragment extends Fragment {
    ImageButton essaib;
    GPIO gpio24;
    GPIO gpio31 ; // linux orientation
    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_one, container, false);
        initUI(v);

        return v;
    }
    private void initUI(View v) {
        essaib = (ImageButton)v.findViewById(R.id.rotation);
        gpio24 = new GPIO(24);
        gpio31 = new GPIO(31); // Linux orientation
        essaib.setOnClickListener(myhandler1);
    }
    View.OnClickListener myhandler1 = new View.OnClickListener() {
        public void onClick(View v) {

            if( (gpio24.getState() == 0) && (gpio31.getState()==0)) {
                gpio24.setState(1);
                gpio31.setState(1);
            }
            else {
                gpio24.setState(0);
                gpio31.setState(0);
            }
        }
        //});
    };



    //};
}
