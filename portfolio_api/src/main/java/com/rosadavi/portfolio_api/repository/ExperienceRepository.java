package com.rosadavi.portfolio_api.repository;

import com.rosadavi.portfolio_api.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExperienceRepository extends JpaRepository<Experience, UUID> {
}
