package com.overtae.onboardingtaskandroid.data.di

import com.overtae.onboardingtaskandroid.data.dao.UserDao
import com.overtae.onboardingtaskandroid.data.repository.UserRepositoryImpl
import com.overtae.onboardingtaskandroid.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideUserRepository(userDao: UserDao): UserRepository {
        return UserRepositoryImpl(userDao)
    }
}
