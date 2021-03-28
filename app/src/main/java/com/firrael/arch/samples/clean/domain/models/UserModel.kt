package com.firrael.arch.samples.clean.domain.models


data class UserModel(val name: String = "", val lastName: String = "")

fun testUserModel(): UserModel {
    return UserModel(TEST_USER_NAME, TEST_USER_LAST_NAME)
}

private const val TEST_USER_NAME = "testName"
private const val TEST_USER_LAST_NAME = "testLastName"