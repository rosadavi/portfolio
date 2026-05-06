package com.rosadavi.portfolio_api.repository;

import com.rosadavi.portfolio_api.entity.Stack;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface StackRepository extends JpaRepository<Stack, UUID> {
    List<Stack> findByUserId(UUID userId);
}
