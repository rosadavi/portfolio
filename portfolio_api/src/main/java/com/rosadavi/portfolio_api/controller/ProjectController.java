package com.rosadavi.portfolio_api.controller;

import com.rosadavi.portfolio_api.entity.Project;
import com.rosadavi.portfolio_api.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/project")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/create")
    public ResponseEntity<Project> createProject(Project project) {
        return ResponseEntity.ok(projectService.save(project));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Project>> getProjectByUserId(UUID userId) {
        return ResponseEntity.ok(projectService.getProjectByUserId(userId));
    }
}
