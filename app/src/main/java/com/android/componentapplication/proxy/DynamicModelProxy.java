package com.android.componentapplication.proxy;

import com.android.commonlibrary.entity.User;
import com.android.componentapplication.CustomApplication;
import com.android.dynamiclibrary.external.interactor.IDynamic;
import com.android.userlibrary.external.provide.UserDataProvide;

/**
 * Created by hsq on 2016/5/26.
 */
public class DynamicModelProxy implements IDynamic{
    @Override
    public User getUser() {
        return UserDataProvide.getUser(CustomApplication.getInstance());

    }
}
