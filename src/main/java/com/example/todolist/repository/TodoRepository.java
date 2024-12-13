package com.example.todolist.repository;

import com.example.todolist.model.ToDo;
import com.example.todolist.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<ToDo, Long> {
}