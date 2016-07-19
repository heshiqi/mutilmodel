package com.android.commonlibrary.proxy;

import android.content.Context;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by hsq on 2016/7/19.
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object obj;


    private DynamicProxyHandler(Context context,String className){
        try {
            obj= Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected Object getObj(){
        return obj;
    }

    public static Object getProxy(Context context ,String className){
        DynamicProxyHandler handler=new DynamicProxyHandler(context,className);
        Object object= Proxy.newProxyInstance(
                handler.getObj().getClass().getClassLoader(),
                handler.getObj().getClass().getInterfaces(),
                handler);
        return object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        result=method.invoke(obj, args);
        return result;
    }
}
