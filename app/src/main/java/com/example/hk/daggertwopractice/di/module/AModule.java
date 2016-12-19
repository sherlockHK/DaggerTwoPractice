package com.example.hk.daggertwopractice.di.module;

import com.example.hk.daggertwopractice.di.annotation.AScope;
import com.example.hk.daggertwopractice.model.Poetry;

import dagger.Module;
import dagger.Provides;

/**
 * Created by HK on 2016/12/19.
 * Email: kaihu1989@gmail.com.
 */

@Module
public class AModule {
    @AScope
    @Provides
    public Poetry getPoetry(){
        return new Poetry("万物美好");
    }
}
