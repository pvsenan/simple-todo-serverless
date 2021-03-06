package se.pscode.todobackend.persistence

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import se.pscode.todobackend.model.TodoModel


@Repository
interface TodoRepository : MongoRepository<TodoModel, String>