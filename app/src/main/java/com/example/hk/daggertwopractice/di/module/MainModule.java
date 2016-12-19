package com.example.hk.daggertwopractice.di.module;

import dagger.Module;

/**
 * Created by HK on 2016/12/19.
 * Email: kaihu1989@gmail.com.
 */

/*
@Module注解表示这个类提供生成一些实例用于注入
 */
@Module
public class MainModule {

    /**
     * @Provides 注解表示这个方法是用来创建某个实例对象的，这里我们创建返回Gson对象
     * 方法名随便，一般用provideXXX结构
     * @return 返回注入对象
     */
    //在ApplicationModule中定义
//    @Provides
//    public Gson provideGson(){
//        return new Gson();
//    }

}
