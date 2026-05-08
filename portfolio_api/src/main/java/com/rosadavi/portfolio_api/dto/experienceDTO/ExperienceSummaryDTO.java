package com.rosadavi.portfolio_api.dto.experienceDTO;

import java.time.LocalDate;
import java.util.UUID;

public record ExperienceSummaryDTO(
        UUID id,
        String name,
        String enterprise,
        LocalDate dateInitial,
        LocalDate dateEnd,
        Boolean actual
) {
}