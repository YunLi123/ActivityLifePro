package com.example.pakar.activitylifecycletest;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

/**
 * Created by Pakar on 2016/5/14.
 */
public class DialogActivity extends Activity {

    public static final String DAG = "DialogActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_layout);
        Log.d(DAG,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(DAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(DAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(DAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(DAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(DAG, "onDestroy");
    }
}
