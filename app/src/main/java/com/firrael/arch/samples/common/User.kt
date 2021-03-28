package com.firrael.arch.samples.common

data class User(val name: String, val lastName: String)

fun testUser(): User {
    return User(TEST_USER_NAME, TEST_USER_LAST_NAME)
}

private const val TEST_USER_NAME = "testName"
private const val TEST_USER_LAST_NAME = "testLastName"