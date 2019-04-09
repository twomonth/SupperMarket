package com.twomonth.suppermarket;

import android.app.Application;

import com.twomonth.mylib_core.app.Latte;

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.0.1").configure();
    }
}
