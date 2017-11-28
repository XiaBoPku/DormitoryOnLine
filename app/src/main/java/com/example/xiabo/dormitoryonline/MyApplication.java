package com.example.xiabo.dormitoryonline;

import android.app.Application;

import com.example.xiabo.dormitoryonline.entity.StudentResponse;


/**
 * Created by xiabo on 2017/11/24.
 */

public class MyApplication extends Application {
    private static MyApplication instance = new MyApplication();
    private static StudentResponse.User user;

    private MyApplication(){}

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static synchronized MyApplication getInstance(){
        return instance;
    }

    public void setUser (StudentResponse.User user){
        this.user = user;
    }

    public StudentResponse.User getUser (){
        return user;
    }
}
