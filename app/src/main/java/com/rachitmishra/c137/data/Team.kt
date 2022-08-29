package com.rachitmishra.c137.data

data class Team(
    val name: String,
    val rank: Int,
    val points: Float,
    val rankChange: String,
    val winningAmount: Int,
    val splitCount: Int,
    val user: User
)

data class User(val id: Int = -1, val name: String, val profilePic: String)
