package com.example.myweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myweather.Controller.WeatherCtrl;
import com.example.myweather.Model.WeatherModel;
import com.example.myweather.Model.WeatherOpenHelper;

public class AddCity extends AppCompatActivity {

    private EditText city;
    private EditText countrycode;
    private Button btn_add_city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_city);

        WeatherOpenHelper con_sqlite = WeatherOpenHelper.getInstance(this);

        city = (EditText) findViewById(R.id.city);
        countrycode = (EditText) findViewById(R.id.countrycode);
        btn_add_city = (Button) findViewById(R.id.btn_add_city);



    }

    private String mnturl(){
        if(city.getText().toString().isEmpty()==false && countrycode.getText().toString().isEmpty() == true){
           return CreateUrl.newurl(city.getText().toString());
        }else if(city.getText().toString().isEmpty()==false && countrycode.getText().toString().isEmpty() == false){
          return CreateUrl.newurl(city.getText().toString() + "," + countrycode.getText().toString());
        }else {
           return "null";
        }
    }


}
