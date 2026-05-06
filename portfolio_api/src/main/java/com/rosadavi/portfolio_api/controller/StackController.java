package com.rosadavi.portfolio_api.controller;

import com.rosadavi.portfolio_api.entity.Stack;
import com.rosadavi.portfolio_api.service.StackService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Stack> createStack(@RequestBody Stack stack) {
        return ResponseEntity.ok(stackService.save(stack));
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<List<Stack>> getStackByUserId(@PathVariable  UUID id) {
        return ResponseEntity.ok(stackService.getStackByUser(id));
    }
}
