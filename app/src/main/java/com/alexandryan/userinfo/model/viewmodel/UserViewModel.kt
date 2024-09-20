package com.alexandryan.userinfo.model.viewmodel

import com.alexandryan.userinfo.data.api.model.User
import com.alexandryan.userinfo.model.repository.UserRepository
import com.alexandryan.userinfo.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val userRepository: UserRepository
): BaseViewModel() {

    private val _userFlow = MutableSharedFlow<List<User>>()
    val userFlow = _userFlow.asSharedFlow()

    fun getUsers() = launchInIO {
        userRepository.getUsers().collectLatest {
            _userFlow.emit(it.results)
        }
    }
}