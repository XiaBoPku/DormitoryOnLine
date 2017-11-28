package com.example.xiabo.dormitoryonline;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by xiabo on 2017/9/30.
 */

public class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    protected void setTitleContent(int titleId){
        getSupportActionBar().setTitle(titleId);
    }

    protected void setTitleContent(String titleContent){
        getSupportActionBar().setTitle(titleContent);
    }
}
