package com.rosadavi.portfolio_api.service;

import com.rosadavi.portfolio_api.dto.experienceAttributesDTO.ExperienceAttributesSummaryDTO;
import com.rosadavi.portfolio_api.dto.experienceDTO.ExperienceCreateDTO;
import com.rosadavi.portfolio_api.dto.experienceDTO.ExperienceResponseDTO;
import com.rosadavi.portfolio_api.dto.experienceDTO.ExperienceSummaryDTO;
import com.rosadavi.portfolio_api.entity.Experience;
import com.rosadavi.portfolio_api.entity.ExperienceAttributes;
import com.rosadavi.portfolio_api.repository.ExperienceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class ExperienceService {
    private final ExperienceRepository experienceRepository;

    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public ExperienceCreateDTO save(Experience experience) {
        Experience newExperience = experienceRepository.save(experience);

        return new ExperienceCreateDTO(
                newExperience.getName(),
                newExperience.getEnterprise(),
                newExperience.getDateInitial(),
                newExperience.getDateEnd(),
                newExperience.getActual()
        );
    }

    public List<ExperienceResponseDTO> getExperienceByUserId(UUID userId) {
        return experienceRepository.findByUserId(userId)
                .stream()
                .map(experience -> new ExperienceResponseDTO(
                        experience.getId(),
                        experience.getName(),
                        experience.getEnterprise(),
                        experience.getDateInitial(),
                        experience.getDateEnd(),
                        experience.getActual(),
                        experience.getExperienceAttributes()
                                .stream()
                                .map(experienceAttributes -> new ExperienceAttributesSummaryDTO(
                                        experienceAttributes.getId(),
                                        experienceAttributes.getDescription()
                                ))
                                .toList()
                ))
                .toList();
    }
}
