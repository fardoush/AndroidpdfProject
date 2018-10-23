package com.example.sherin.androidpdfproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

public class MainActivity extends AppCompatActivity {
    private CardView schoolCardView,hospitalCardView,resturentCardView,airportCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView()
    {
        schoolCardView=findViewById(R.id.schoolCardViewId);
        hospitalCardView=findViewById(R.id.hospitalCardViewId);
        resturentCardView=findViewById(R.id.resturentCardViewId);
        airportCardView=findViewById(R.id.airportCardViewId);


    }
}
