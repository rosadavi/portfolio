package com.rosadavi.portfolio_api.controller;

import com.rosadavi.portfolio_api.entity.ExperienceAttributes;
import com.rosadavi.portfolio_api.service.ExperienceAttributesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experience-attributes")
public class ExperienceAttributesController {
    private final ExperienceAttributesService experienceAttributesService;

    public ExperienceAttributesController(ExperienceAttributesService experienceAttributesService) {
        this.experienceAttributesService = experienceAttributesService;
    }

    @PostMapping("/create")
    public ResponseEntity<ExperienceAttributes> createExperienceAttributes(ExperienceAttributes experienceAttributes) {
        return ResponseEntity.ok(experienceAttributesService.save(experienceAttributes));
    }
}
