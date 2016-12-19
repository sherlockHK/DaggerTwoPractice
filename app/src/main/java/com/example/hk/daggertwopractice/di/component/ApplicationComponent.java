package com.example.hk.daggertwopractice.di.component;

import com.example.hk.daggertwopractice.di.module.AModule;
import com.example.hk.daggertwopractice.di.module.ApplicationModule;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by HK on 2016/12/19.
 * Email: kaihu1989@gmail.com.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    Gson getGson();  //暴露接口

    //AComponent plus();
    AComponent plus(AModule module);//添加声明
}
