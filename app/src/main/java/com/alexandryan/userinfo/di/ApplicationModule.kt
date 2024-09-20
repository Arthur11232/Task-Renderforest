package com.alexandryan.userinfo.di

import com.alexandryan.userinfo.data.exceptions.ExceptionHandler
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Singleton
    @Provides
    fun provideExceptionHandler() = ExceptionHandler()
}