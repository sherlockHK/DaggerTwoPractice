package com.example.hk.daggertwopractice.model;

import javax.inject.Inject;

/**
 * Created by HK on 2016/12/17.
 * Email: kaihu1989@gmail.com.
 */

public class Poetry {
    private String mPemo;

    // 用Inject标记构造函数,表示用它来注入到目标对象中去
    @Inject
    public Poetry() {
        mPemo = "生活就像海洋";
    }

    public Poetry(String poems) {
        mPemo = poems;
    }

    public String getPemo() {
        return mPemo;
    }
}
