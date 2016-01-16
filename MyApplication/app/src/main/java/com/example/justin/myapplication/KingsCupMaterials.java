package com.example.justin.myapplication;

import android.os.Bundle;
import android.app.Activity;

public class KingsCupMaterials extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kings_cup_materials);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
