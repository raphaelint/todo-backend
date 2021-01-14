package com.interview.project.controller;

import com.interview.project.domain.Task;
import com.interview.project.exception.RecordNotFoundException;
import com.interview.project.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://raphaeltodo.herokuapp.com")
@RequestMapping("api/v1/todos")
@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @CrossOrigin(origins = "hhttps://raphaeltodo.herokuapp.com")
    @GetMapping
    public ResponseEntity getAllEmployees() {
        List<Task> list = taskService.getAllTasks();

        return ResponseEntity.ok(list);
    }

    @CrossOrigin(origins = "https://raphaeltodo.herokuapp.com")
    @DeleteMapping(path = "{id}")
    public ResponseEntity deleteEmployeeById(@PathVariable("id") Long id)
        throws RecordNotFoundException {
        taskService.deleteTaskById(id);
        return ResponseEntity.ok(null);
    }

    @CrossOrigin(origins = "https://raphaeltodo.herokuapp.com")
    @PostMapping
    public ResponseEntity createUser(@RequestBody Task task) {
        Task entity = taskService.createTask(task);
        return ResponseEntity.ok(entity);
    }

    @CrossOrigin(origins = "https://raphaeltodo.herokuapp.com")
    @PutMapping(path = "{id}")
    public ResponseEntity editUser(@RequestBody Task task, @PathVariable("id") Long id) {
        Task entity = taskService.updateTask(task, id);
        return ResponseEntity.ok(entity);
    }
}
