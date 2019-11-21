package com.example.myweather.DAO;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.myweather.Model.WeatherModel;
import com.example.myweather.Model.WeatherOpenHelper;

public class WeatherDAO {

    private final WeatherOpenHelper CONN_INSTANCE;

    public WeatherDAO(WeatherOpenHelper CONN_INSTANCE){
        this.CONN_INSTANCE = CONN_INSTANCE;
    }

    public long saveWeather(WeatherModel weather){

        SQLiteDatabase db = CONN_INSTANCE.getWritableDatabase();

        try{
            ContentValues values = new ContentValues();
            values.put("id",weather.getId());
            values.put("weather",weather.getWeather());
            values.put("temperature",weather.getTemp());

            long idCityInserted = db.insert("Weather",null, values);

            return idCityInserted;

        }catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }

}
