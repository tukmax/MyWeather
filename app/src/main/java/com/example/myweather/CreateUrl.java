package com.example.myweather;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import retrofit2.http.GET;

public class CreateUrl {

    public static String newurl(String pesquisa) {
        String endpoint = "http://api.openweathermap.org/data/2.5/weather?q=";
        String appidapi = "&APPID=afeb3f38cdff7769f0f18c09357e5750";
        String apiurl = endpoint + pesquisa + appidapi;
        return  apiurl;
    }

    public static void httpRequest(String stringURL) {
        URL url = null;

        try {
            url = new URL(stringURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();

            inputStream = httpURLConnection.getInputStream();

            StringBuilder output = new StringBuilder();

            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            while(line != null) {
                output.append(line);
                line = reader.readLine();
            }

            String json = output.toString();

            try {
                JSONObject base = new JSONObject(json);

                JSONObject obj = base.getJSONObject("weather");

                JSONArray array = base.getJSONArray("lol");

                double temp = obj.optDouble("temp");

                String id = base.optString("id");
            } catch (JSONException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
