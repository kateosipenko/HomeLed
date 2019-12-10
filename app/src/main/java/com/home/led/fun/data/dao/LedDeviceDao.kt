package com.home.led.`fun`.data.dao

import androidx.room.*
import com.home.led.`fun`.model.LedDevice
import io.reactivex.Flowable

@Dao
interface LedDeviceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(deviceDao: LedDevice)

    @Update
    fun update(deviceDao: LedDevice)

    @Delete
    fun delete(deviceDao: LedDevice)

    @Query("select * from LedDeviceTable")
    fun getDevices(): Flowable<List<LedDevice>>
}
