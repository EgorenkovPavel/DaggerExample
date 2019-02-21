package com.example.daggerexample;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class StorageModule {

    @Provides
    DatabaseHelper provideDatabaseHelper() {
        return new DatabaseHelper();
    }

    @Named("prod")
    @Provides
    public DatabaseUtils provideDatabaseUtils() {
        return new DatabaseUtils("database.db");
    }

    @Named("test")
    @Provides
    public DatabaseUtils provideDatabaseUtilsTest() {
        return new DatabaseUtils("test.db");
    }
}
