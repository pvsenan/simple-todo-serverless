package se.pscode.todobackend.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/todo")
class ToDoController {
    @PostMapping("/create")
    fun createTodo(): String{
        return "hello"
    }
}