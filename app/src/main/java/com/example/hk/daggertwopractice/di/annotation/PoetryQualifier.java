package com.example.hk.daggertwopractice.di.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by HK on 2016/12/19.
 * Email: kaihu1989@gmail.com.
 */

//@Qualifier用来区别，当注入同一实例时，在module中有多个注入方法
//而Dagger2已经默认帮我们实现了一个@Named:
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface PoetryQualifier {
    String value() default "";
}
