package com.codepath.mibre2.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // set applicationId, and server server based on the values in the back4app settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        // TODO: FIX THIS SECTION WHEN GURU ARRIVES
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Y9sOrAAgOxlVDub56wsN7N64sKxlzLVpAsS7d4eN") // should correspond to Application Id env variable
                .clientKey("g5HBjY26bKR3WdH0ITMw3dUG5fIBwcrTKQnL9lhn")  // should correspond to Client key env variable
                .server("https://parseapi.back4app.com/").build());
    }
}
