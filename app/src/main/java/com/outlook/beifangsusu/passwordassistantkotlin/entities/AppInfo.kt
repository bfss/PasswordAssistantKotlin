package com.outlook.beifangsusu.passwordassistantkotlin.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AppInfo(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "app_password") val appPassword: String?
)
