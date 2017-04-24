package com.example.hp.change_parameters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by hp on 20-04-2017.
 */

public class threeFragment extends Fragment{
    int wait_time = 1000;
    Frame  frame = new Frame();
   GPIO gpio209;
    ImageButton very_low;
    ImageButton low ;
    ImageButton  high;
    ImageButton  very_high;
    public threeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_three, container, false);
        View v = inflater.inflate(R.layout.fragment_three, container, false);
        initUI(v);

        return v;
    }

    private void initUI(View v) {
       // gpio209=new GPIO(209);

        very_low = (ImageButton)v.findViewById(R.id.button2);
        low = ( ImageButton )v.findViewById(R.id.button3);
        high = ( ImageButton )v.findViewById(R.id.button4);
        very_high = ( ImageButton ) v.findViewById(R.id.button5);

        very_low.setOnClickListener(myhandler1);
        low.setOnClickListener(myhandler2);
        high.setOnClickListener(myhandler3);
        very_high.setOnClickListener(myhandler4);

    }

    View.OnClickListener myhandler1 = new View.OnClickListener() {
        public void onClick(View v) {

                     String[] commands = {
                    "echo 1 > /sys/class/gpio/gpio209/value",
                    "sleep 0.002",
                    "echo 0 > /sys/class/gpio/gpio209/value",
                    "sleep 0.001",
                    "echo 0 > /sys/class/gpio/gpio209/value",
                    "sleep 0.001",
                    "echo 0 > /sys/class/gpio/gpio209/value",
                    "sleep 0.002"
            };

          frame.execCommands(commands);

        //   Toast.makeText(getActivity(), "very low", Toast.LENGTH_SHORT).show();
        }



    };

    View.OnClickListener myhandler2 = new View.OnClickListener() {
        public void onClick(View v) {

            String[] commands = {
                    "echo 1 > /sys/class/gpio/gpio209/value",
                    "sleep 0.002",
                    "echo 0 > /sys/class/gpio/gpio209/value",
                    "sleep 0.001",
                    "echo 1 > /sys/class/gpio/gpio209/value",
                    "sleep 0.001",
                    "echo 0 > /sys/class/gpio/gpio209/value",
                    "sleep 0.002",
            };

            frame.execCommands(commands);

          //  Toast.makeText(getActivity(), "low", Toast.LENGTH_SHORT).show();
        }

    };

    View.OnClickListener myhandler3 = new View.OnClickListener() {
        public void onClick(View v) {

            String[] commands = {
                    "echo 1 > /sys/class/gpio/gpio209/value",
                    "sleep 0.002",
                    "echo 1 > /sys/class/gpio/gpio209/value",
                    "sleep 0.001",
                    "echo 0 > /sys/class/gpio/gpio209/value",
                    "sleep 0.001",
                    "echo 0 > /sys/class/gpio/gpio209/value",
                    "sleep 0.002",
            };

            frame.execCommands(commands);

        //    Toast.makeText(getActivity(), "High", Toast.LENGTH_SHORT).show();
        }

    };

    View.OnClickListener myhandler4 = new View.OnClickListener() {
        public void onClick(View v) {

            String[] commands = {
                    "echo 1 > /sys/class/gpio/gpio209/value",
                    "sleep 0.002",
                    "echo 1 > /sys/class/gpio/gpio209/value",
                    "sleep 0.001",
                    "echo 1 > /sys/class/gpio/gpio209/value",
                    "sleep 0.001",
                    "echo 0 > /sys/class/gpio/gpio209/value",
                    "sleep 0.002",
            };

            frame.execCommands(commands);

       //     Toast.makeText(getActivity(), "very high", Toast.LENGTH_SHORT).show();

        }

    };

}
