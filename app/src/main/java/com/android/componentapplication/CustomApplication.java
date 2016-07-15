package com.android.componentapplication;

import android.app.Application;

/**
 * Created by Administrator on 2016/5/26.
 */
public class CustomApplication extends Application{

    private static CustomApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application=this;
    }

    public static CustomApplication getInstance(){
        return application;
    }
}
