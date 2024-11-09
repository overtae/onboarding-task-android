package com.overtae.onboardingtaskandroid.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.overtae.onboardingtaskandroid.domain.model.Result
import com.overtae.onboardingtaskandroid.domain.model.User
import com.overtae.onboardingtaskandroid.domain.usecase.DeleteUserUseCase
import com.overtae.onboardingtaskandroid.domain.usecase.GetUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val getUserUseCase: GetUserUseCase,
    private val deleteUserUseCase: DeleteUserUseCase,
) : ViewModel() {
    private val _userResult = MutableStateFlow<Result<User>>(Result.Loading)
    val userResult = _userResult.asStateFlow()

    fun getUserByEmail(email: String) {
        viewModelScope.launch {
            _userResult.value = getUserUseCase(email)
        }
    }

    fun deleteUser(user: User) {
        viewModelScope.launch {
            deleteUserUseCase(user)
        }
    }
}