package se.pscode.todobackend.types

import java.time.LocalDateTime

data class TodoRequest(val todoTitle: String, val todoDueDate: LocalDateTime, val todoCompleted: Boolean)
