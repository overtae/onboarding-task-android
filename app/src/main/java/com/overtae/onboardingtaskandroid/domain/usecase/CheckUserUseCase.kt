package com.overtae.onboardingtaskandroid.domain.usecase

import com.overtae.onboardingtaskandroid.domain.model.Result
import com.overtae.onboardingtaskandroid.domain.repository.UserRepository
import javax.inject.Inject

class CheckUserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(email: String, password: String): Result<String> {
        return userRepository.checkIsValidUser(email, password)
    }
}