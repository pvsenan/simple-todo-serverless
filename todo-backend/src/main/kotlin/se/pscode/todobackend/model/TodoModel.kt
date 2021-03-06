package se.pscode.todobackend.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime
import java.util.HashMap
import javax.annotation.processing.Generated


@Document
class TodoModel(@Id private val id: String, private val todoName: String,
                private val todoDueDate: LocalDateTime, private val todoCompleted: Boolean){}