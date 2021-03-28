package com.firrael.arch.samples.mvi

import androidx.lifecycle.ViewModel
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.postSideEffect
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container

class MainViewModelMvi : ContainerHost<UserState, UserSideEffect>, ViewModel() {
    override val container = container<UserState, UserSideEffect>(UserState())

    fun printUser() = intent {
        postSideEffect(UserSideEffect.ConsoleMessage("MVI user: ${state.user}"))

        reduce {
            state.copy(user = state.user)
        }
    }
}