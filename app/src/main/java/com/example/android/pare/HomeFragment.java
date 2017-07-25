package com.example.android.pare;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Date;
import static android.content.Context.MODE_PRIVATE;
import static com.example.android.pare.R.id.textView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private String dayMark;

    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle("Home");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        //Defining the functions in the home fragment

        //Making current date and time visible.
        TextView timeView = (TextView) view.findViewById(R.id.curr_time);
        TextView dateView = (TextView) view.findViewById(R.id.curr_date);
        String Chour = String.valueOf(new java.util.Date().getHours());
        String Cmin = String.valueOf(new java.util.Date().getMinutes());
        timeView.setText(Chour + " : " + Cmin);
        int year = new Date().getYear() + 1900;
        dateView.setText(String.valueOf(new java.util.Date().getDate() + " / " + new java.util.Date().getMonth() + " / " + year));
        return view;
    }

    public void setP(View view){
        SharedPreferences.Editor editor = getContext().getApplicationContext().getSharedPreferences("My Data", MODE_PRIVATE).edit();
        editor.putString("present", "yes");
        editor.apply();
    }
    public void setA(View view){
        SharedPreferences.Editor editor = getContext().getApplicationContext().getSharedPreferences("My Data", MODE_PRIVATE).edit();
        editor.putString("absent", "yes");
        editor.apply();
    }
}
