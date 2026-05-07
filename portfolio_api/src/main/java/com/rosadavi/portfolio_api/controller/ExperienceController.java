package com.rosadavi.portfolio_api.controller;

import com.rosadavi.portfolio_api.dto.experienceDTO.ExperienceCreateDTO;
import com.rosadavi.portfolio_api.dto.experienceDTO.ExperienceResponseDTO;
import com.rosadavi.portfolio_api.entity.Experience;
import com.rosadavi.portfolio_api.service.ExperienceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/experience")
public class ExperienceController {
    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @PostMapping("/create")
    public ResponseEntity<ExperienceCreateDTO> createExperience(@RequestBody Experience experience) {
        return ResponseEntity.ok(experienceService.save(experience));
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<List<ExperienceResponseDTO>> getExperienceByUserId(@PathVariable UUID id) {
        return ResponseEntity.ok(experienceService.getExperienceByUserId(id));
    }
}
