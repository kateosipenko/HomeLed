package com.home.led.`fun`.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.home.led.`fun`.data.dao.LedDeviceDao
import com.home.led.`fun`.model.LedDevice

@Database(
    version = LedDatabase.DB_VERSION,
    exportSchema = true,
    entities = [LedDevice::class]
)
public abstract class LedDatabase : RoomDatabase() {

    abstract fun getLedDeviceDao(): LedDeviceDao

    companion object {
        internal const val VERSION_1 = 1
        internal const val DB_VERSION = VERSION_1

        const val DB_NAME = "led.db"
    }
}