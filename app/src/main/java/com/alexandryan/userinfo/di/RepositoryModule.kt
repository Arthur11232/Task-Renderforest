package com.alexandryan.userinfo.di

import com.alexandryan.userinfo.data.api.services.UserService
import com.alexandryan.userinfo.model.repository.UserRepository
import com.alexandryan.userinfo.model.repository.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(ActivityComponent::class)
class RepositoryModule {
    @Provides
    fun provideUserRepositoryImpl(service: UserService): UserRepository = UserRepositoryImpl(service)
}