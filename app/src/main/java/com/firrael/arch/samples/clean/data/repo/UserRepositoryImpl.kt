package com.firrael.arch.samples.clean.data.repo

import com.firrael.arch.samples.clean.domain.models.UserModel
import com.firrael.arch.samples.clean.domain.models.testUserModel
import com.firrael.arch.samples.clean.domain.repositories.UserRepository
import io.reactivex.rxjava3.core.Single

class UserRepositoryImpl : UserRepository {
    override fun getUser(): Single<UserModel> {
        return Single.just(testUserModel())
    }
}