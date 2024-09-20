package com.alexandryan.userinfo.model.repository

import com.alexandryan.userinfo.data.api.reponse.AppResponse
import com.alexandryan.userinfo.data.api.reponse.UserResponse
import com.alexandryan.userinfo.data.api.services.UserService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val api: UserService
): UserRepository {
    override suspend fun getUsers(): Flow<UserResponse> = flowOf(api.getUsers().result)
}