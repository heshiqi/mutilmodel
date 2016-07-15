package com.android.userlibrary.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.android.userlibrary.R;

/**
 * Created by Administrator on 2016/5/26.
 */
public class UserInfoActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
        findViewById(R.id.btn_open_dynamic).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("chezhu://dynamic/view?userid=123"));
                startActivity(intent);
            }
        });
    }
}
