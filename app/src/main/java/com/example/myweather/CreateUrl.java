package com.example.myweather;

public class CreateUrl {

    public static String newurl(String pesquisa) {
        String endpoint = "http://api.openweathermap.org/data/2.5/weather?q=";
        String appidapi = "&APPID=afeb3f38cdff7769f0f18c09357e5750";
        String apiurl = endpoint + pesquisa + appidapi;
        return  apiurl;
    }

}
