package com.wx.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by corn on 2018/1/11.
 */

public class SecondActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("SecondActivity ","onCreate");
        setContentView(R.layout.activity_second);
    }
}
