package com.example.daggerexample;

import javax.inject.Named;

import dagger.Component;

//FIRST METHOD - GET methods

//@Component(modules = {StorageModule.class, NetworkModule.class})
//public interface AppComponent {
//    NetworkUtils getNetworkUtils();
//    DatabaseHelper getDatabaseHelper();

//@Named("prod")
//DatabaseUtils getDatabaseUtils();
//

//@Named("test")
//DatabaseUtils getDatabaseUtilsTest();
//}

//SECOND METHOD - injects

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {
    void injectsMainActivity(MainActivity mainActivity);
}