package com.firrael.arch.samples.mvi

import com.firrael.arch.samples.common.User
import com.firrael.arch.samples.common.testUser


data class UserState(
    val user: User = testUser()
)
