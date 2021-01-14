package com.interview.project.controller;

import com.interview.project.exception.RecordNotFoundException;
import com.interview.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.interview.project.domain.User;
import org.springframework.ui.Model;


import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "https://raphaeltodo.herokuapp.com")
@RequestMapping("api/v1/users")
@RestController
public class UserController {

    @Autowired
    UserService service;

    @CrossOrigin(origins = "https://raphaeltodo.herokuapp.com")
    @GetMapping
    public ResponseEntity getAllEmployees() {
        List<User> list = service.getAllUsers();

        return ResponseEntity.ok(list);
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity deleteEmployeeById(@PathVariable("id") Long id)
        throws RecordNotFoundException {
        service.deleteUserById(id);
        return ResponseEntity.ok(null);
    }

    @CrossOrigin(origins = "https://raphaeltodo.herokuapp.com")
    @PostMapping
    public ResponseEntity createUser(@RequestBody User user) {
        User entity = service.createUser(user);
        return ResponseEntity.ok(entity);
    }

    @CrossOrigin(origins = "https://raphaeltodo.herokuapp.com")
    @PutMapping(path = "{id}")
    public ResponseEntity editUser(@RequestBody User user, @PathVariable("id") Long id) {
        User entity = service.updateUser(user, id);
        return ResponseEntity.ok(entity);
    }
}
