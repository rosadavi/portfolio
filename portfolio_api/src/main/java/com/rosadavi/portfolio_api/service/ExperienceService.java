package com.rosadavi.portfolio_api.service;

import com.rosadavi.portfolio_api.entity.Experience;
import com.rosadavi.portfolio_api.repository.ExperienceRepository;

import java.util.List;
import java.util.UUID;

public class ExperienceService {
    private final ExperienceRepository experienceRepository;

    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public Experience save(Experience experience) {
        return experienceRepository.save(experience);
    }

    public List<Experience> getExperienceByUserId(UUID userId) {
        return experienceRepository.findByUserId(userId);
    }
}
