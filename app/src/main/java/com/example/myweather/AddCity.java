package com.example.myweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddCity extends AppCompatActivity {

    private EditText city;
    private EditText countrycode;
    private Button btn_add_city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_city);

        city = (EditText) findViewById(R.id.city);
        countrycode = (EditText) findViewById(R.id.countrycode);
        btn_add_city = (Button) findViewById(R.id.btn_add_city);


    }


}
