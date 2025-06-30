package com.example.userapi.controller;

import com.example.userapi.model.User;
import com.example.userapi.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    // Create User
    @PostMapping("/create-user")
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    // Update User
    @PostMapping("/update-user")
    public ResponseEntity<User> updateUser(@RequestParam String id, @RequestBody User user) {
        return service.updateUser(id, user)
                .map(updatedUser -> new ResponseEntity<>(updatedUser, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Get All Users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    // Toggle User
    @PostMapping("/toggle-user")
    public Optional<User> toggleUser(@RequestParam String id) {
        return service.toggleUser(id);
    }
}
