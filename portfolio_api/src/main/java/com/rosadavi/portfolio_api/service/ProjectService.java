package com.rosadavi.portfolio_api.service;

import com.rosadavi.portfolio_api.dto.projectDTO.ProjectCreateDTO;
import com.rosadavi.portfolio_api.dto.projectDTO.ProjectResponseDTO;
import com.rosadavi.portfolio_api.dto.stackDTO.StackSummaryDTO;
import com.rosadavi.portfolio_api.entity.Project;
import com.rosadavi.portfolio_api.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public ProjectCreateDTO save(Project project) {
        Project newProject = projectRepository.save(project);

        return new ProjectCreateDTO(
                newProject.getTopic1(),
                newProject.getTopic2(),
                newProject.getTitle(),
                newProject.getDescription()
        );
    }

    public List<ProjectResponseDTO> getProjectByUserId(UUID userId) {
        return projectRepository.findByUserId(userId)
                .stream()
                .map(projects -> new ProjectResponseDTO(
                        projects.getTopic1(),
                        projects.getTopic2(),
                        projects.getTitle(),
                        projects.getDescription(),
                        projects.getStacks()
                                .stream()
                                .map(stack -> new StackSummaryDTO(
                                        stack.getName(),
                                        stack.getUse()
                                ))
                                .toList()
                ))
                .toList();
    }
}
