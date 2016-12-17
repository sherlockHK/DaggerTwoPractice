package com.example.hk.daggertwopractice.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.hk.daggertwopractice.R;
import com.example.hk.daggertwopractice.model.Poetry;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //添加@Inject注解，表示这个mPoetry是需要注入的
    @Inject
    Poetry mPoetry;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mTextView = (TextView) findViewById(R.id.tv_poetry);
        mTextView.setText(mPoetry.getPemo());
    }
}
