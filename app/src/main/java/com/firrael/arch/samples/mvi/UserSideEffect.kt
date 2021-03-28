package com.firrael.arch.samples.mvi


sealed class UserSideEffect {
    data class ConsoleMessage(val text: String) : UserSideEffect()
}