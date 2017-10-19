package com.example.windows.tipcalc;

import android.app.Application;

/**
 * Created by windows on 18/10/2017.
 */

public class TipCalcApp extends Application {

    private final static String ABOUT_URL = "https://github.com/VictorUrielPG";

    public String getAboutUrl(){
        return ABOUT_URL;
    }
}
