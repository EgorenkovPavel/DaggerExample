package com.example.daggerexample;

import android.database.DatabaseUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Lazy;

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

    @Inject
    Lazy<DatabaseHelper> mDatabaseUtilsProvider;

//    @Named("prod")
//    @Inject
//    DatabaseUtils mDatabaseUtils;
//
//    @Named("test")
//    @Inject
//    DatabaseUtils mDatabaseUtilsTest;

    @Inject
    Set<Action> eventHandlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getComponent().injectsMainActivity(this);

        mDatabaseUtilsProvider.get(); // creates and returns DatabaseUtils object
    }

}
