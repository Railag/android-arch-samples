package com.firrael.arch.samples.clean.domain.usecases

import com.firrael.arch.samples.clean.domain.models.UserModel
import com.firrael.arch.samples.clean.domain.repositories.UserRepository
import io.reactivex.rxjava3.core.Single

class GetUserUseCase(val userRepository: UserRepository) :
    SingleUseCase<UserModel> {

    override fun execute(): Single<UserModel> {
        return userRepository.getUser()
    }
}