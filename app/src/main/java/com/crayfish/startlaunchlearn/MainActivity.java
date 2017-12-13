package com.crayfish.startlaunchlearn;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG,"onNewIntent time"+intent.getLongExtra("time",0));
    }

    public void textClick(View v){
        Intent intent = new Intent();
//        intent.setClass(MainActivity.this,SecondActivity.class);
        intent.setAction("com.crayfish.b");
        intent.setAction("com.crayfish.action");
        intent.addCategory("com.crayfish.b");
//        intent.addCategory(Intent.CATEGORY_DEFAULT);
        intent.addCategory("com.crayfish.category");
//        intent.putExtra("time", SystemClock.currentThreadTimeMillis());
        startActivity(intent);
    }
}
