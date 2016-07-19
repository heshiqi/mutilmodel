package com.android.dynamiclibrary.external.interactor;

import android.app.Application;
import android.content.Context;

import com.android.commonlibrary.CommonCanstant;
import com.android.commonlibrary.entity.User;
import com.android.commonlibrary.proxy.DynamicProxyHandler;
import com.android.commonlibrary.utils.ConfigUtil;

/**
 * Created by hsq on 2016/5/26.
 */
public class DynamicDelegate implements IDynamic{
    private IDynamic iDynamic;

    private static DynamicDelegate dynamicProxy;

    public static DynamicDelegate getInstance(Application contex){
        final DynamicDelegate proxy=dynamicProxy;
        synchronized (DynamicDelegate.class){
            if(proxy==null){
                dynamicProxy=new DynamicDelegate(contex);
            }
        }
        return  dynamicProxy;
    }

    private DynamicDelegate(Context context){
        iDynamic= (IDynamic) DynamicProxyHandler.getProxy(context,ConfigUtil.getDelegateClassName(context,CommonCanstant.DYNAMIC_COMPONENT));
    }
    @Override
    public User getUser() {
        return iDynamic.getUser();
    }
}
