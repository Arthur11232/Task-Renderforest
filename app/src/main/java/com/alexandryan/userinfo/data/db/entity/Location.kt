package com.alexandryan.userinfo.data.db.entity


data class Location(
    val street: Street?,
    val city: String?,
    val state: String?,
    val country: String?,
    val postcode: Int?,
    val coordinates: Coordinates?,
    val timezone: Timezone?
)