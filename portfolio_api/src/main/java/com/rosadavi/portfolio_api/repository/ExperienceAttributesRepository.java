package com.rosadavi.portfolio_api.repository;

import com.rosadavi.portfolio_api.entity.ExperienceAttributes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExperienceAttributesRepository extends JpaRepository<ExperienceAttributes, UUID> {
}
