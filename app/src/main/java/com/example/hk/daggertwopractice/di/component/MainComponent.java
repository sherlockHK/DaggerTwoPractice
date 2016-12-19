package com.example.hk.daggertwopractice.di.component;

import com.example.hk.daggertwopractice.di.annotation.PoetryScope;
import com.example.hk.daggertwopractice.di.module.MainModule;
import com.example.hk.daggertwopractice.di.module.PoetryModule;
import com.example.hk.daggertwopractice.view.MainActivity;
import com.example.hk.daggertwopractice.view.OtherActivity;

import dagger.Component;

/**
 * Created by HK on 2016/12/19.
 * Email: kaihu1989@gmail.com.
 */

//用@Component表示这个接口是一个连接器，能用@Component注解的只能是interface或者抽象类
//这里表示Component会从MainModule,PoetryModule类中拿那些用@Provides注解的方法来生成需要注入的实例
@PoetryScope
@Component(modules = {MainModule.class, PoetryModule.class})
public abstract class MainComponent {

    /**
     * 需要用到这个连接器的对象，就是这个对象里面有需要注入的属性
     * （被标记为@Inject的属性）
     * 这里inject表示注入的意思，这个方法名可以随意更改，但建议就
     * 用inject即可。
     */
    public abstract void inject(MainActivity activity);

    public abstract void inject(OtherActivity activity);

    private static MainComponent sComponent;
    public static MainComponent getInstance(){
        if (sComponent == null){
            sComponent = DaggerMainComponent.builder().build();
        }
        return sComponent;
    }
}
