package com.example.mytasks.domain

data class TodoItem(
    val id: Int,
    val text: String,
    val isDone: Boolean,
    val dateOfCreation: String
)
