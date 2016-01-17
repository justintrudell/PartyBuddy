package com.example.justin.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class FingersStep2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fingers_step2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void goToFingersStep3(View view) {
        Intent intent = new Intent(this, FingersStep3.class);
        startActivity(intent);
    }
}
