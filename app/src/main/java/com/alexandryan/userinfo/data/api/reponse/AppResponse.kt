package com.alexandryan.userinfo.data.api.reponse

import com.alexandryan.userinfo.data.db.entity.Info

data class AppResponse<T>(
    val result: T,
    val status: String,
)