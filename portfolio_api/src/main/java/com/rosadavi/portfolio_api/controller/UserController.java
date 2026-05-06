package com.rosadavi.portfolio_api.controller;

import com.rosadavi.portfolio_api.entity.User;
import com.rosadavi.portfolio_api.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<User> getUserByUserId(@PathVariable UUID id) {
        return ResponseEntity.ok(userService.getUserByUserId(id));
    }
}
