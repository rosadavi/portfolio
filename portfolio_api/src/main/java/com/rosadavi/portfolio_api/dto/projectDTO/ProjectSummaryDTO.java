package com.rosadavi.portfolio_api.dto.projectDTO;

import java.util.UUID;

public record ProjectSummaryDTO(
        UUID id,
        String topic1,
        String topic2,
        String tile,
        String description
) {
}