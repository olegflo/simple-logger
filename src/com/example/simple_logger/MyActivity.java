package com.example.simple_logger;

import android.app.Activity;
import android.os.Bundle;

public class MyActivity extends Activity {

    private Lo lo = new Lo(this);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        lo.g("onCreate");
        lo.gi("info");
        lo.gw("warning");
        lo.ge("error");

        lo.g("Some message with param: %s", "hello world!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        lo.g("onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        lo.g("onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        lo.g("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        lo.g("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        lo.g("onDestroy");
    }
}
