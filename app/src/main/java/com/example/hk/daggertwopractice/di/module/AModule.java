package com.example.hk.daggertwopractice.di.module;

import com.example.hk.daggertwopractice.di.annotation.AScope;
import com.example.hk.daggertwopractice.di.annotation.PoetryQualifier;
import com.example.hk.daggertwopractice.model.Poetry;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by HK on 2016/12/19.
 * Email: kaihu1989@gmail.com.
 */

@Module
public class AModule {

    @PoetryQualifier("A")
    @AScope
    @Provides
    public Poetry getPoetry(){
        return new Poetry("万物美好");
    }

    @PoetryQualifier("B")
    @AScope
    @Provides
    public Poetry getOtherPoetry(){
        return new Poetry("另外一首诗");
    }

    @Named("C")
    @AScope
    @Provides
    public Poetry getNamedPoetry(){
        return new Poetry("Dagger2默认实现了Qualifier：@Named");
    }
}
