package com.android.componentapplication.delegate;

import com.android.commonlibrary.entity.User;
import com.android.componentapplication.CustomApplication;
import com.android.dynamiclibrary.external.interactor.IDynamic;
import com.android.userlibrary.external.provide.UserDataProvide;

/**
 * Created by Administrator on 2016/5/26.
 */
public class DynamicDelegate implements IDynamic{
    @Override
    public User getUser() {
        return UserDataProvide.getUser(CustomApplication.getInstance());

    }
}
