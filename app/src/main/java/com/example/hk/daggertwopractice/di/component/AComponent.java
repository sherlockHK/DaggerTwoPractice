package com.example.hk.daggertwopractice.di.component;

import com.example.hk.daggertwopractice.di.annotation.AScope;
import com.example.hk.daggertwopractice.di.module.AModule;
import com.example.hk.daggertwopractice.view.AActivity;

import dagger.Subcomponent;

/**
 * Created by HK on 2016/12/19.
 * Email: kaihu1989@gmail.com.
 */

@AScope
@Subcomponent(modules = AModule.class)
public interface AComponent {
    void inject(AActivity activity);
}
