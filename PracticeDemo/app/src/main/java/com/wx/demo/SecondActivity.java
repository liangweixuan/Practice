package com.wx.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by corn on 2018/1/11.
 */

public class SecondActivity extends AppCompatActivity{

    private TextView tv_text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("SecondActivity ","onCreate");
        setContentView(R.layout.activity_second);
        tv_text = findViewById(R.id.tv_text);
        TextView text = new TextView(this);

    }
}
