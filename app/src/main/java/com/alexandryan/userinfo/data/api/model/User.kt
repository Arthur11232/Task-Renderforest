package com.alexandryan.userinfo.data.api.model

import androidx.room.Entity
import androidx.room.PrimaryKey

data class User(
    val gender: String?,
    val name: Name?,
    val location: Location?,
    val email: String?,
    val login: Login?,
    val dob: Dob?,
    val registered: Registered?,
    val phone: String?,
    val cell: String?,
    val id: Id?,
    val picture: Picture?,
    val nat: String?
)