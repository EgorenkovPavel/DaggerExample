package com.example.daggerexample;

import dagger.Component;

//FIRST METHOD - GET methods

//@Component(modules = {StorageModule.class, NetworkModule.class})
//public interface AppComponent {
//    NetworkUtils getNetworkUtils();
//    DatabaseHelper getDatabaseHelper();
//}

//SECOND METHOD - injects

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {
    void injectsMainActivity(MainActivity mainActivity);
}