package com.wx.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by corn on 2018/1/11.
 */

public class SecondActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"aa",Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_second);
    }
}
