package com.example.myweather.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class WeatherOpenHelper extends SQLiteOpenHelper {

    private static WeatherOpenHelper CONN_INSTANCE;
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "WeatherDB";


    public WeatherOpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    // criando o singleton
    public static WeatherOpenHelper getInstance(Context context){
        if(CONN_INSTANCE==null){
            return CONN_INSTANCE = new WeatherOpenHelper(context);
        }
        return CONN_INSTANCE;

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlquery =
                    "CREATE TABLE IF NOT EXISTS tb_weather (" +
                            "id INTEGER PRIMARY KEY," +
                            "weather TEXT," +
                            "temp INTEGER" +
                            ")";
        sqLiteDatabase.execSQL(sqlquery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
