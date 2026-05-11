package com.rosadavi.portfolio_api.service;

import com.rosadavi.portfolio_api.dto.stackDTO.StackCreateDTO;
import com.rosadavi.portfolio_api.dto.stackDTO.StackResponseDTO;
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

    public StackCreateDTO save(Stack stack) {
        Stack newStack = stackRepository.save(stack);
        return new StackCreateDTO(
                newStack.getName(),
                newStack.getUse()
        );
    }

    public List<StackResponseDTO> getStackByUser(UUID userId) {
        return stackRepository.findByUserId(userId)
                .stream()
                .map(stack -> new StackResponseDTO(
                        stack.getId(),
                        stack.getUse(),
                        stack.getName()
                ))
                .toList();
    }
}
