package com.rosadavi.portfolio_api.dto.experienceDTO;

import java.time.LocalDate;

public record ExperienceSummaryDTO(
        String name,
        String enterprise,
        LocalDate dateInitial,
        LocalDate dateEnd,
        Boolean actual
) {
}