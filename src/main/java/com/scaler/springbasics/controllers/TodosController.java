package com.scaler.springbasics.controllers;

import com.scaler.springbasics.Exceptions.taskNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("todos")
public class TodosController {
    List<TodoObject> todos = new ArrayList<>();

    @PostMapping("")
    void addTodos(@RequestBody TodoObject task) {
        todos.add(task);
    }

    @GetMapping("")
    List<TodoObject> showTodos() {
        return todos;
    }

    @GetMapping("/{todoId}")
    TodoObject showTodo(@PathVariable int todoId) throws taskNotFoundException {
        if (todos.size() < todoId) {
            throw new taskNotFoundException(HttpStatus.NOT_FOUND, "entity not found");
        }
        return todos.get(todoId - 1);
    }

    @PutMapping("/{todoId}/done")
    TodoObject updateTodo(@PathVariable int todoId) throws taskNotFoundException {
        if (todos.size() < todoId) {
            throw new taskNotFoundException(HttpStatus.NOT_FOUND, "entity not found");
        }
        todos.get(todoId - 1).done = true;
        return todos.get(todoId - 1);
    }

    @DeleteMapping("/{todoId}/done")
    TodoObject deleteTodo(@PathVariable int todoId) throws taskNotFoundException {
        if (todos.size() < todoId) {
            throw new taskNotFoundException(HttpStatus.NOT_FOUND, "entity not found");
        }
        todos.get(todoId - 1).done = false;
        return todos.get(todoId - 1);
    }


}
