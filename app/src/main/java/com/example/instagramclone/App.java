package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ZQQl84PWAaKtnvxN1htonfj7ZUlFdsvUGvSUwqcN")
                // if defined
                .clientKey("o61CMqzVAMaHrKLJMHPKWeF1ZtbOQeuyoeGpAUUi")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
