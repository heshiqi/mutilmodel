package com.android.dynamiclibrary.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.commonlibrary.entity.User;
import com.android.dynamiclibrary.R;
import com.android.dynamiclibrary.external.interactor.DynamicDelegate;

/**
 * Created by hsq on 2016/5/26.
 */
public class DynamicHomeActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtnPraise;
    private Button mBtnCai;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_home);
        mBtnPraise=(Button)findViewById(R.id.btn_praise);
        mBtnCai=(Button)findViewById(R.id.btn_cai);
        mBtnPraise.setOnClickListener(this);
        mBtnCai.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        if(id==R.id.btn_praise){
           if(checkIsLogin()){
               Toast.makeText(this,"赞一个",Toast.LENGTH_SHORT).show();
           }
        }else if(id==R.id.btn_cai){
            if(checkIsLogin()){
                Toast.makeText(this,"踩一个",Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean checkIsLogin(){
        User user= DynamicDelegate.getInstance(getApplication()).getUser();
        Log.d("hh",user+"");
        return user!=null;
    }
}
