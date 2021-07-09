package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("GxLoX233x9dHn2Erv2eebuj1roXaDXDh9iup3vLs")
                .clientKey("fLsb5tw0ydT8qFvF0lNGSfjQvTHF1d3T6lqFVXsb")
                .server("https://parseapi.back4app.com")
                .build()
        );


    }
}
