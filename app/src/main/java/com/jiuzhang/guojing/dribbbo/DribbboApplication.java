package com.jiuzhang.guojing.dribbbo;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

public class DribbboApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
