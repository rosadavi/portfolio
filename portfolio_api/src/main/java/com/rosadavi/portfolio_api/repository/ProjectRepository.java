package com.rosadavi.portfolio_api.repository;

import com.rosadavi.portfolio_api.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjectRepository extends JpaRepository<Project, UUID> {
}
