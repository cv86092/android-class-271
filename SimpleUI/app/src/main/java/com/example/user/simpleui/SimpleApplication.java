package com.example.user.simpleui;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Michael on 2016/8/2.
 */
public class SimpleApplication extends Application{

    @Override
    public void onCreate(){

        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                        .applicationId("76ee57f8e5f8bd628cc9586e93d428d5")
                        .server("http://parseserver-ps662-env.us-east-1.elasticbeanstalk.com/parse/")
                       // .clientKey("j4gN5TkM8aXQBkjuJsDu3i6Tgm5spovNwIUf0AU8")
                        .build());
    }
}
