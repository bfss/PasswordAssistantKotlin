package com.outlook.beifangsusu.passwordassistantkotlin.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.outlook.beifangsusu.passwordassistantkotlin.entities.AppInfo

@Dao
interface AppInfoDao {
    @Query("SELECT * FROM app_info")
    fun getAll(): List<AppInfo>

    @Insert
    fun insertAll(vararg appInfo: AppInfo)

    @Delete
    fun delete(appInfo: AppInfo)
}
