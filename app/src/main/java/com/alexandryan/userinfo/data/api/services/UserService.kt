package com.alexandryan.userinfo.data.api.services

import com.alexandryan.userinfo.data.api.reponse.AppResponse
import com.alexandryan.userinfo.data.api.reponse.UserResponse
import retrofit2.http.GET

interface UserService {
    @GET("api?seed=renderforest&results=20&page")
    suspend fun getUsers(): AppResponse<UserResponse>
}