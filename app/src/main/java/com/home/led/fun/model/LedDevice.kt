package com.home.led.`fun`.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "LedDeviceTable")
class LedDevice {
    @ColumnInfo(name = "_id")
    @PrimaryKey(autoGenerate = true)
    var id = -1
    @ColumnInfo(name = "name")
    var name: String = ""
    @ColumnInfo(name = "ip_address")
    var ipAddress: String = ""
    @ColumnInfo(name = "port")
    var port: String = ""
}
