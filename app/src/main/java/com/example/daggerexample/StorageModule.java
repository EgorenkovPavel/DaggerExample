package com.example.daggerexample;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public class StorageModule {

    @Provides
    DatabaseHelper provideDatabaseHelper() {
        return new DatabaseHelper();
    }

    @Named("prod")
    @Provides
    DatabaseUtils provideDatabaseUtils() {
        return new DatabaseUtils("database.db");
    }

    @Named("test")
    @Provides
    DatabaseUtils provideDatabaseUtilsTest() {
        return new DatabaseUtils("test.db");
    }

    @Provides
    @IntoSet
    Action provideAnalyticsManager() {
        return new AnalyticsManager();
    }

    @Provides
    @IntoSet
    Action provideLogger() {
        return new Logger();
    }
}
