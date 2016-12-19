package com.example.hk.daggertwopractice.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.hk.daggertwopractice.MainApplication;
import com.example.hk.daggertwopractice.R;
import com.example.hk.daggertwopractice.di.annotation.PoetryQualifier;
import com.example.hk.daggertwopractice.model.Poetry;
import com.google.gson.Gson;

import javax.inject.Inject;

/**
 * Created by HK on 2016/12/19.
 * Email: kaihu1989@gmail.com.
 */
public class AActivity extends AppCompatActivity{
    TextView mTextView;

    @Inject
    Gson mGson;

    // 匹配Module中同样注解的方法
    @PoetryQualifier("A")
    @Inject
    Poetry mPoetry;

    // 匹配Module中同样注解的方法
    @PoetryQualifier("B")
    @Inject
    Poetry mPoetryB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        MainApplication.getInstance()
                .getAComponent()
                .inject(this);

        mTextView = (TextView) findViewById(R.id.text);
        String text = mPoetry.getPemo()+",mPoetryA:"+mPoetry+
                mPoetryB.getPemo()+",mPoetryB:"+mPoetryB+
                (mGson == null ? "Gson没被注入" : "Gson已经被注入");
        mTextView.setText(text);
    }
}
