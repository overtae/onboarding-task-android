package com.overtae.onboardingtaskandroid.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.overtae.onboardingtaskandroid.data.dao.UserDao
import com.overtae.onboardingtaskandroid.data.model.UserEntity

@Database(entities = [UserEntity::class], version = 1)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}
