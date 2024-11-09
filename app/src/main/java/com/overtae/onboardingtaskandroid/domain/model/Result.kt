package com.overtae.onboardingtaskandroid.domain.model

sealed interface Result<out T> {
    data class Success<T>(val data: T) : Result<T>
    data class Error(val message: String?, val code: ErrorCode = ErrorCode.SERVER) : Result<Nothing>
    data object Loading : Result<Nothing>
}
