package com.firrael.arch.samples.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.firrael.arch.samples.common.User
import com.firrael.arch.samples.common.testUser
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _user = MutableLiveData<User>()
    val user: LiveData<User> = _user

    init {
        viewModelScope.launch {
            _user.value = testUser()
        }
    }
}