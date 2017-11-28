package com.example.xiabo.dormitoryonline;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by xiabo on 2017/11/23.
 */

public class SuccessActivity extends BaseActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        setTitleContent("办理宿舍成功");
        findViewById(R.id.bt_go_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SuccessActivity.this,HomeActivity.class));
            }
        });
    }
}
