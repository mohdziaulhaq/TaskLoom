package com.taskloom.controller;

import com.taskloom.domain.TodoDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/todos")
public class TodoController {

    @PostMapping
    public ResponseEntity<TodoDto> addTodo(@RequestBody TodoDto todo) {
        return new ResponseEntity<>(todo, HttpStatus.CREATED);
    }
}
