package com.example.justin.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;

public class FingersActivity extends AppCompatActivity {

    private ExpandListAdapter ExpAdapter;
    private ArrayList<Group> ExpListItems;
    private ExpandableListView ExpandList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fingers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ExpandList = (ExpandableListView) findViewById(R.id.exp_list);
        ExpListItems = SetStandardGroups();
        ExpAdapter = new ExpandListAdapter(FingersActivity.this, ExpListItems);
        ExpandList.setAdapter(ExpAdapter);
    }

    public ArrayList<Group> SetStandardGroups() {

        int group_names[] = { R.drawable.summary, R.drawable.whatyouneed,R.drawable.howtoplay };

        String text_groups[] = { getResources().getString(R.string.rideTheBusDesc), getResources().getString(R.string.rideTheBusPlayers),
                getResources().getString(R.string.rideTheBusMaterials),
                getResources().getString(R.string.rideTheBusInstructionsLine1), getResources().getString(R.string.rideTheBusInstructionsLine2),
                getResources().getString(R.string.rideTheBusInstructionsLine3), getResources().getString(R.string.rideTheBusInstructionsLine4)};

        ArrayList<Group> list = new ArrayList<Group>();

        ArrayList<Child> ch_list;

        int j = 0;

        // Summary
        int group_name = group_names[0];
        Group gru = new Group();
        gru.setImage(group_name);
        ch_list = new ArrayList<Child>();
        for (; j < 2; j++) {
            Child ch = new Child();
            ch.setText(text_groups[j]);
            ch_list.add(ch);
        }
        gru.setItems(ch_list);
        list.add(gru);

        // Materials
        group_name = group_names[1];
        gru = new Group();
        gru.setImage(group_name);
        ch_list = new ArrayList<Child>();
        for (; j < 3; j++) {
            Child ch = new Child();
            ch.setText(text_groups[j]);
            ch_list.add(ch);
        }
        gru.setItems(ch_list);
        list.add(gru);

        // How to play
        group_name = group_names[2];
        gru = new Group();
        gru.setImage(group_name);
        ch_list = new ArrayList<Child>();
        for (; j < 7; j++) {
            Child ch = new Child();
            ch.setText(text_groups[j]);
            ch_list.add(ch);
        }
        gru.setItems(ch_list);
        list.add(gru);


        return list;
    }

}
