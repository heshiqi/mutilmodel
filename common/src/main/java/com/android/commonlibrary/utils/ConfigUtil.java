package com.android.commonlibrary.utils;

import android.content.Context;

import com.android.commonlibrary.CommonCanstant;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by hsq on 2016/5/26.
 */
public class ConfigUtil {
    public static String getDelegateClassName(Context context,String key){
        String className=null;
        Properties prop = new Properties();
        try {
            InputStream in = context.getAssets().open(CommonCanstant.COMPONENT_PROPERTIES);
            prop.load(in);
            className=prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return className;
    }
}
