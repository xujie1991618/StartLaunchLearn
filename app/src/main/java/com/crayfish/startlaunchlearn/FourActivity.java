package com.crayfish.startlaunchlearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * ============================
 * 作    者：crayfish(徐杰)
 * 创建日期：2017/12/13.
 * 描    述：
 * 修改历史：
 * ===========================
 */

public class FourActivity extends AppCompatActivity {

    private static final String TAG = "FourActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG,"onNewIntent time"+intent.getLongExtra("time",0));
    }

    public void taskClick(View v){
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("time",System.currentTimeMillis());
        startActivity(intent);
    }

    public void topClick(View v){
        Intent intent = new Intent(this,ThreeActivity.class);
        intent.putExtra("time",System.currentTimeMillis());
        startActivity(intent);
    }

    public void instanceClick(View v){
        Intent intent = new Intent(this,FourActivity.class);
        intent.putExtra("time",System.currentTimeMillis());
        startActivity(intent);
    }
}
