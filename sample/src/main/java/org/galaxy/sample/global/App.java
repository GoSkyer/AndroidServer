package org.galaxy.sample.global;

import android.app.Application;

import org.galaxy.androidserver.newApi.AndroidServer;

/**
 * Created by OoO on 2017/1/21.
 */

public class App extends Application {

    private static App instance;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

    }

}
