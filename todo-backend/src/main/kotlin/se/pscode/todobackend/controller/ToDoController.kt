package se.pscode.todobackend.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import se.pscode.todobackend.service.ToDoService
import se.pscode.todobackend.types.TodoRequest

@RestController
@RequestMapping("/v1/todo")
class ToDoController(@Autowired private val todoService: ToDoService) {
    @PostMapping("/create")
    fun createTodo(@RequestBody todoRequest: TodoRequest): TodoRequest{
        todoService.saveTodo(todoRequest)
        return todoRequest
    }
}