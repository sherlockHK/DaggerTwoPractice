package com.example.hk.daggertwopractice.di.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by HK on 2016/12/19.
 * Email: kaihu1989@gmail.com.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface AScope {
}
