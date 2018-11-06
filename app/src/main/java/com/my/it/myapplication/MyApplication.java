package com.my.it.myapplication;

import android.app.Application;
import android.util.Log;

import cn.bmob.v3.Bmob;

/**
 * Created by it on 2018/11/6.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this, "fe7772b217501810af5d36815162ac43");
        Log.e("Bmob.initialize-----", "onCreate: ");
    }
}
