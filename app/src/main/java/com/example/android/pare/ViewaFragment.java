package com.example.android.pare;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewaFragment extends Fragment {


    public ViewaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_viewa, container, false);
        SharedPreferences prefs = getContext().getSharedPreferences("My data", MODE_PRIVATE);
        String restoredText = prefs.getString("text", null);
        String absent = prefs.getString("absent", "Not defined");//"No name defined" is the default value.
        String present = prefs.getString("present", "Not defined");
        TextView pTextView = (TextView) view.findViewById(R.id.p_textView);
        TextView aTextView = (TextView) view.findViewById(R.id.a_textView);
        pTextView.setText(present);
        aTextView.setText(absent);
        return view;
    }



    }
