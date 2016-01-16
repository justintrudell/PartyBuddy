package com.example.justin.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class KingsCupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kings_cup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void goToKingsCupMaterials(View view) {
        Intent intent = new Intent(this, KingsCupMaterials.class);
        startActivity(intent);
    }

    public void goToKingsCupHowToPlay(View view) {
        Intent intent = new Intent(this, KingsCupHowToPlay.class);
        startActivity(intent);
    }

}
