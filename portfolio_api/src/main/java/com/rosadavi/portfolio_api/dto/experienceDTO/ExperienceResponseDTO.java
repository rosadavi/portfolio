package com.rosadavi.portfolio_api.dto.experienceDTO;

import com.rosadavi.portfolio_api.dto.experienceAttributesDTO.ExperienceAttributesSummaryDTO;

import java.time.LocalDate;
import java.util.List;

public record ExperienceResponseDTO(
        String name,
        String enterprise,
        LocalDate dateInitial,
        LocalDate dateEnd,
        Boolean actual,
        List<ExperienceAttributesSummaryDTO> experienceAttribute
) {
}
