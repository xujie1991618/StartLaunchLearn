package com.crayfish.startlaunchlearn;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * ============================
 * 作    者：crayfish(徐杰)
 * 创建日期：2017/12/12.
 * 描    述：
 * 修改历史：
 * ===========================
 */

public class SecondActivity extends AppCompatActivity{

    private static final String TAG = "SecondActivity";
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)super.findViewById(R.id.textView);
        textView.setText(TAG+getIntent().getLongExtra("time",0));
        textView.setOnClickListener(view -> Toast.makeText(SecondActivity.this, "111", Toast.LENGTH_SHORT).show());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        textView.setText(TAG+intent.getLongExtra("time",0));
        Log.d(TAG,"onNewIntent time"+intent.getLongExtra("time",0));
    }

    public void textClick(View v){
        Intent intent = new Intent();
        intent.setClass(SecondActivity.this,MainActivity.class);
        intent.putExtra("time", SystemClock.currentThreadTimeMillis());
        startActivity(intent);
    }
}
