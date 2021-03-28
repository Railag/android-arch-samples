package com.firrael.arch.samples.clean.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.firrael.arch.samples.clean.data.repo.UserRepositoryImpl
import com.firrael.arch.samples.clean.domain.models.UserModel
import com.firrael.arch.samples.clean.domain.usecases.GetUserUseCase
import kotlinx.coroutines.launch


class UserViewModel : ViewModel() {
    private val _user = MutableLiveData<UserModel>()
    val user: LiveData<UserModel> = _user

    val getUserUseCase: GetUserUseCase = GetUserUseCase(UserRepositoryImpl()) // injection using DI

    init {
        viewModelScope.launch {
            getUserUseCase.execute()
                .subscribe({
                    _user.postValue(it)
                }, {
                    Log.e("UserViewModel", "GetUserUseCase error", it)
                })
        }
    }
}