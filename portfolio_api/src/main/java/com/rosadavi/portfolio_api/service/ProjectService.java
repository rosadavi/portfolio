package com.rosadavi.portfolio_api.service;

import com.rosadavi.portfolio_api.entity.Project;
import com.rosadavi.portfolio_api.repository.ProjectRepository;

public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project save(Project project) {
        return projectRepository.save(project);
    }
}
