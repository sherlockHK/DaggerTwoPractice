package com.example.hk.daggertwopractice;

import android.app.Application;

import com.example.hk.daggertwopractice.di.component.AComponent;
import com.example.hk.daggertwopractice.di.component.ApplicationComponent;
import com.example.hk.daggertwopractice.di.component.DaggerApplicationComponent;
import com.example.hk.daggertwopractice.di.module.AModule;

/**
 * Created by HK on 2016/12/19.
 * Email: kaihu1989@gmail.com.
 */

public class MainApplication extends Application {
    private ApplicationComponent mApplicationComponent;
    private AComponent mAComponent;
    private static MainApplication sApplication;

    public static MainApplication getInstance() {
        return sApplication;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;

        mApplicationComponent = DaggerApplicationComponent.builder().build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    public AComponent getAComponent() {
        if (mAComponent == null){
            mAComponent = mApplicationComponent.plus(new AModule());
        }
        return mAComponent;
    }
}
