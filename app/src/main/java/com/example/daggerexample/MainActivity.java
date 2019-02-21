package com.example.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    // FIRST METHOD
//    DatabaseHelper databaseHelper;
//    NetworkUtils networkUtils;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        databaseHelper = App.getComponent().getDatabaseHelper();
//        networkUtils = App.getComponent().getNetworkUtils();
//    }

    // SECOND METHOD
    @Inject
    DatabaseHelper databaseHelper;
    @Inject
    NetworkUtils networkUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getComponent().injectsMainActivity(this);
    }

}
