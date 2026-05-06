package com.rosadavi.portfolio_api.service;

import com.rosadavi.portfolio_api.entity.Stack;
import com.rosadavi.portfolio_api.repository.StackRepository;

public class StackService {
    private final StackRepository stackRepository;

    public StackService(StackRepository stackRepository) {
        this.stackRepository = stackRepository;
    }

    public Stack save(Stack stack) {
        return stackRepository.save(stack);
    }
}
