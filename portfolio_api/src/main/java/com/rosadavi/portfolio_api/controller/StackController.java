package com.rosadavi.portfolio_api.controller;

import com.rosadavi.portfolio_api.entity.Stack;
import com.rosadavi.portfolio_api.service.StackService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/stack")
public class StackController {
    private final StackService stackService;

    public StackController(StackService stackService) {
        this.stackService = stackService;
    }

    @PostMapping("/create")
    public ResponseEntity<Stack> createStack(Stack stack) {
        return ResponseEntity.ok(stackService.save(stack));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Stack>> getStackByUserId(UUID userId) {
        return ResponseEntity.ok(stackService.getStackByUser(userId));
    }
}
