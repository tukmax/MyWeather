package com.example.myweather.Controller;

import com.example.myweather.DAO.WeatherDAO;
import com.example.myweather.Model.WeatherModel;
import com.example.myweather.Model.WeatherOpenHelper;

public class WeatherCtrl {

    private final WeatherDAO weatherDAO;

    public WeatherCtrl(WeatherOpenHelper CONN_INSTANCE){
        weatherDAO = new WeatherDAO(CONN_INSTANCE);
    }

    public long saveWeatherCtrl(WeatherModel weather){
        return this.weatherDAO.saveWeather(weather);
    }

}
