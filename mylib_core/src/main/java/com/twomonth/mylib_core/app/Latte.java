package com.twomonth.mylib_core.app;

import android.content.Context;

import java.util.WeakHashMap;

/**
 * @创建日期 on 2019/4/4 0004
 * @作者 twomonth
 * @简单描述 添加描述
 */
public final class Latte {

    public static Configurator init(Context context){
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstance();
    }

    public static WeakHashMap<String,Object> getConfigurations(){
        return Configurator.getInstance().getLatteConfigs();
    }

    public static Context getApplication(){
        return (Context) getConfigurations().get(ConfigType.APPLICATION_CONTEXT.name());
    }
}
