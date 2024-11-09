package com.overtae.onboardingtaskandroid.data.mapper

import com.overtae.onboardingtaskandroid.data.model.UserEntity
import com.overtae.onboardingtaskandroid.domain.model.User

fun UserEntity.toUser(): User {
    return User(
        email = email, password = password, username = username
    )
}

fun User.toUserEntity(): UserEntity {
    return UserEntity(
        email = email, password = password, username = username
    )
}
