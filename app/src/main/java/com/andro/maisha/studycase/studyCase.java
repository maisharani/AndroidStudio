package com.andro.maisha.studycase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class studyCase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast, Toast.LENGTH_LONG);
        toast.show();
    }
}
