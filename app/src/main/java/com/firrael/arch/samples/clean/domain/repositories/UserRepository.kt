package com.firrael.arch.samples.clean.domain.repositories

import com.firrael.arch.samples.clean.domain.models.UserModel
import io.reactivex.rxjava3.core.Single


interface UserRepository {
    fun getUser(): Single<UserModel>
}