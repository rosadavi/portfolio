package com.rosadavi.portfolio_api.dto.experienceDTO;

import com.rosadavi.portfolio_api.dto.experienceAttributesDTO.ExperienceAttributesSummaryDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record ExperienceResponseDTO(
        UUID id,
        String name,
        String enterprise,
        LocalDate dateInitial,
        LocalDate dateEnd,
        Boolean actual,
        List<ExperienceAttributesSummaryDTO> experienceAttribute
) {
}
