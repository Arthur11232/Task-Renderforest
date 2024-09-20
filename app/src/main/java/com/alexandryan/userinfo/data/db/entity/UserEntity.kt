package com.alexandryan.userinfo.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val gender: String?,
    val name: Name?,
    val location: Location?,
    val email: String?,
    val login: Login?,
    val dob: Dob?,
    val registered: Registered?,
    val phone: String?,
    val cell: String?,
    val user_id: Id?,
    val picture: Picture?,
    val nat: String?
)