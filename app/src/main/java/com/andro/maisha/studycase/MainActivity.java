package com.andro.maisha.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launcSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent;
        intent = new Intent(this, studyCase.class);
        startActivity(intent);
    }

    public void launchSecondActivity1(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent;
        intent = new Intent(this, studyCase1.class);
        startActivity(intent);
    }
}
