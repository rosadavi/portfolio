package com.rosadavi.portfolio_api.dto.experienceDTO;

import java.time.LocalDate;

public record ExperienceCreateDTO(
        String name,
        String enterprise,
        LocalDate dateInitial,
        LocalDate dateEnd,
        Boolean actual
) {
}
