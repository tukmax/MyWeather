package com.example.myweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //codigo da api
        // api.openweathermap.org/data/2.5/weather?q=" + CidadeVar +"&APPID=afeb3f38cdff7769f0f18c09357e5750"
    }
}
