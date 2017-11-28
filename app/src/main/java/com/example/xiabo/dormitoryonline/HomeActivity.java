package com.example.xiabo.dormitoryonline;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.xiabo.dormitoryonline.entity.StudentResponse;


/**
 * Created by xiabo on 2017/11/23.
 */

public class HomeActivity extends BaseActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        setTitleContent("分配宿舍信息");
    }

    private void initView() {
         StudentResponse.User user = MyApplication.getInstance().getUser();
        ((TextView) findViewById(R.id.tv_home_name)).setText(user.getName());
        ((TextView) findViewById(R.id.tv_home_num)).setText(user.getStudentid());
        ((TextView) findViewById(R.id.tv_home_sex)).setText(user.getGender());
        ((TextView) findViewById(R.id.tv_stat)).setText("已办理完成");
        ((TextView) findViewById(R.id.tv_building_num)).setText(user.getName());
        ((TextView) findViewById(R.id.tv_dorm_num)).setText("5214");

    }
}
