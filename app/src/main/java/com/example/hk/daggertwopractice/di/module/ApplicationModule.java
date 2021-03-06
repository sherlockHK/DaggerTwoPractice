package com.example.hk.daggertwopractice.di.module;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by HK on 2016/12/19.
 * Email: kaihu1989@gmail.com.
 */

@Module
public class ApplicationModule {
    /**
     * @Provides 注解表示这个方法是用来创建某个实例对象的，这里我们创建返回Gson对象
     * 方法名随便，一般用provideXXX结构
     * @return 返回注入对象
     */
    @Singleton
    @Provides
    public Gson provideGson(){
        return new Gson();
    }
}
