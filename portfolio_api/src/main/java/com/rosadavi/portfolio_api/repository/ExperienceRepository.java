package com.rosadavi.portfolio_api.repository;

import com.rosadavi.portfolio_api.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ExperienceRepository extends JpaRepository<Experience, UUID> {
    List<Experience> findByUserId(UUID userId);
}
