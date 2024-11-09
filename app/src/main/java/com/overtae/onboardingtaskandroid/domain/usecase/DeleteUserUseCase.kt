package com.overtae.onboardingtaskandroid.domain.usecase

import com.overtae.onboardingtaskandroid.domain.model.Result
import com.overtae.onboardingtaskandroid.domain.model.User
import com.overtae.onboardingtaskandroid.domain.repository.UserRepository
import javax.inject.Inject

class DeleteUserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(user: User): Result<Unit> {
        return userRepository.deleteUser(user)
    }
}