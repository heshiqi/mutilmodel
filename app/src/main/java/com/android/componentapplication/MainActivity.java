package com.android.componentapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.android.dynamiclibrary.activity.DynamicHomeActivity;
import com.android.userlibrary.activity.UserInfoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtnOpenDynamic;
    private Button mBtnOpenUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnOpenDynamic=(Button)findViewById(R.id.btn_dynamic);
        mBtnOpenUser=(Button)findViewById(R.id.btn_user);
        mBtnOpenDynamic.setOnClickListener(this);
        mBtnOpenUser.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_dynamic:
                Intent intent=new Intent(this, DynamicHomeActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_user:
                Intent intent1=new Intent(this, UserInfoActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
