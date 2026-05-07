package com.rosadavi.portfolio_api.controller;

import com.rosadavi.portfolio_api.dto.projectDTO.ProjectCreateDTO;
import com.rosadavi.portfolio_api.dto.projectDTO.ProjectResponseDTO;
import com.rosadavi.portfolio_api.entity.Project;
import com.rosadavi.portfolio_api.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<ProjectCreateDTO> createProject(@RequestBody Project project) {
        return ResponseEntity.ok(projectService.save(project));
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<List<ProjectResponseDTO>> getProjectByUserId(@PathVariable UUID id) {
        return ResponseEntity.ok(projectService.getProjectByUserId(id));
    }
}
