package com.alexandryan.userinfo.model.repository

import com.alexandryan.userinfo.data.api.reponse.AppResponse
import com.alexandryan.userinfo.data.api.reponse.UserResponse
import kotlinx.coroutines.flow.Flow

interface UserRepository {

    suspend fun getUsers(): Flow<UserResponse>
}