package com.example.hk.daggertwopractice.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.hk.daggertwopractice.R;
import com.example.hk.daggertwopractice.di.component.MainComponent;
import com.example.hk.daggertwopractice.model.Poetry;
import com.google.gson.Gson;

import javax.inject.Inject;

/**
 * Created by HK on 2016/12/19.
 * Email: kaihu1989@gmail.com.
 */

public class OtherActivity extends AppCompatActivity {
    //添加@Inject注解，表示这个mPoetry是需要注入的
    @Inject
    Poetry mPoetry;

    @Inject
    Gson mGson;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        MainComponent.getInstance()
                .inject(this);

        initView();
    }

    private void initView() {
        mTextView = (TextView) findViewById(R.id.tv_poetry);
        String json = mGson.toJson(mPoetry);
        String text = json + ",mPoetry:"+mPoetry;
        mTextView.setText(text);
    }
}
