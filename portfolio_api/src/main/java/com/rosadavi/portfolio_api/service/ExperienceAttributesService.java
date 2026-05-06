package com.rosadavi.portfolio_api.service;

import com.rosadavi.portfolio_api.entity.ExperienceAttributes;
import com.rosadavi.portfolio_api.repository.ExperienceAttributesRepository;

public class ExperienceAttributesService {
    private final ExperienceAttributesRepository experienceAttributesRepository;

    public ExperienceAttributesService(ExperienceAttributesRepository experienceAttributesRepository) {
        this.experienceAttributesRepository = experienceAttributesRepository;
    }

    public ExperienceAttributes save(ExperienceAttributes experienceAttributes) {
        return experienceAttributesRepository.save(experienceAttributes);
    }
}
