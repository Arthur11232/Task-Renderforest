package com.alexandryan.userinfo.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alexandryan.userinfo.data.db.entity.UserEntity

@Database(entities = [UserEntity::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
}