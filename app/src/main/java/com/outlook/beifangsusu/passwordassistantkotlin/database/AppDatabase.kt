package com.outlook.beifangsusu.passwordassistantkotlin.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.outlook.beifangsusu.passwordassistantkotlin.daos.AppInfoDao
import com.outlook.beifangsusu.passwordassistantkotlin.daos.PasswordInfoDao
import com.outlook.beifangsusu.passwordassistantkotlin.entities.AppInfo
import com.outlook.beifangsusu.passwordassistantkotlin.entities.PasswordInfo

@Database(entities = [AppInfo::class, PasswordInfo::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun appInfoDao(): AppInfoDao
    abstract fun passwordInfoDao(): PasswordInfoDao
}
