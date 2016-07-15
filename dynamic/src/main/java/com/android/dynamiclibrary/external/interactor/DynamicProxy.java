package com.android.dynamiclibrary.external.interactor;

import android.app.Application;
import android.content.Context;

import com.android.commonlibrary.CommonCanstant;
import com.android.commonlibrary.entity.User;
import com.android.commonlibrary.utils.ConfigUtil;

/**
 * Created by Administrator on 2016/5/26.
 */
public class DynamicProxy implements IDynamic{
    private static final String CLASS_PATH="com.android.componentapplication.delegate.DynamicDelegate";
    private IDynamic iDynamic;

    private static DynamicProxy dynamicProxy;

    public static DynamicProxy getInstance(Application contex){
        final DynamicProxy proxy=dynamicProxy;
        synchronized (DynamicProxy.class){
            if(proxy==null){
                dynamicProxy=new DynamicProxy(contex);
            }
        }
        return  dynamicProxy;
    }

    private DynamicProxy(Context context){
        try {
            iDynamic= (IDynamic) Class.forName(ConfigUtil.getDelegateClassName(context,CommonCanstant.DYNAMIC_COMPONENT)).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Override
    public User getUser() {
        return iDynamic.getUser();
    }
}
