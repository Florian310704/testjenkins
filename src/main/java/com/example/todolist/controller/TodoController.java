package com.example.todolist.controller;

import com.example.todolist.model.ToDo;
import com.example.todolist.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    // Constructeur pour l'injection du service
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<ToDo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @PostMapping
    public ToDo createTodo(@RequestBody ToDo todo) {
        return todoService.createTodo(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable Long id) {
        todoService.deleteTodoById(id);
    }
}