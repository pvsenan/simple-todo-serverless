package se.pscode.todobackend.service

import org.springframework.stereotype.Service
import se.pscode.todobackend.model.TodoModel
import se.pscode.todobackend.persistence.TodoRepository
import se.pscode.todobackend.types.TodoRequest

@Service
class ToDoService(private val todoRepository:TodoRepository) {
    fun saveTodo(todoRequest: TodoRequest){
        val model = TodoModel("1",todoRequest.todoTitle, todoRequest.todoDueDate,todoRequest.todoCompleted)
        todoRepository.save(model)
    }
}