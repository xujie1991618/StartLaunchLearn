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
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
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

    public void intentFilterClick(View v){
        Intent intent = new Intent();
        intent.setAction("com.crayfish.action.a");
        intent.setAction("com.crayfish.action");
        intent.addCategory("com.crayfish.b");
//        intent.addCategory(Intent.CATEGORY_DEFAULT);
        intent.addCategory("com.crayfish.category");
//        intent.putExtra("time", SystemClock.currentThreadTimeMillis());
        startActivity(intent);
    }


}
