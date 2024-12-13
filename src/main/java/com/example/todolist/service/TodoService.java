package com.example.todolist.service;

import com.example.todolist.model.ToDo;
import com.example.todolist.model.ToDo;
import com.example.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<ToDo> getAllTodos() {
        return todoRepository.findAll();
    }

    public ToDo createTodo(ToDo todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodoById(Long id) {
        todoRepository.deleteById(id);
    }
}