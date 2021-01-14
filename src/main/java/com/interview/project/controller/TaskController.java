package com.interview.project.controller;

import com.interview.project.domain.Task;
import com.interview.project.exception.RecordNotFoundException;
import com.interview.project.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("api/v1/todos")
@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping
    public ResponseEntity getAllEmployees() {
        List<Task> list = taskService.getAllTasks();

        return ResponseEntity.ok(list);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping(path = "{id}")
    public ResponseEntity deleteEmployeeById(@PathVariable("id") Long id)
        throws RecordNotFoundException {
        taskService.deleteTaskById(id);
        return ResponseEntity.ok(null);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping
    public ResponseEntity createUser(@RequestBody Task task) {
        Task entity = taskService.createTask(task);
        return ResponseEntity.ok(entity);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PutMapping(path = "{id}")
    public ResponseEntity editUser(@RequestBody Task task, @PathVariable("id") Long id) {
        Task entity = taskService.updateTask(task, id);
        return ResponseEntity.ok(entity);
    }
}
