package com.android.userlibrary.external.provide;

import android.app.Application;

import com.android.commonlibrary.entity.User;

/**
 * Created by Administrator on 2016/5/26.
 */
public class UserDataProvide {

    /**
     *  获取登录对象
     * @param context
     * @return
     */
    public static final User getUser(Application context){
        User user=new User();
        user.setId(123);
        user.setName("测试");
        return user;
    }
}
