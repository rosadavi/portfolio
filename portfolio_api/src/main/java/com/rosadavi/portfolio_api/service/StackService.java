package com.rosadavi.portfolio_api.service;

import com.rosadavi.portfolio_api.entity.Stack;
import com.rosadavi.portfolio_api.repository.StackRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StackService {
    private final StackRepository stackRepository;

    public StackService(StackRepository stackRepository) {
        this.stackRepository = stackRepository;
    }

    public Stack save(Stack stack) {
        return stackRepository.save(stack);
    }

    public List<Stack> getStackByUser(UUID userId) {
        return stackRepository.findByUserId(userId);
    }
}
