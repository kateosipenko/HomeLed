package com.home.led.`fun`.di.module

import android.app.Application
import androidx.room.Room
import com.home.led.`fun`.data.LedDatabase
import com.home.led.`fun`.data.dao.LedDeviceDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): LedDatabase {
        return Room.databaseBuilder(app, LedDatabase::class.java, LedDatabase.DB_NAME)
            .build()
    }

    @Provides
    @Singleton
    fun provideLedDevicesDao(database: LedDatabase): LedDeviceDao {
        return database.getLedDeviceDao()
    }
}