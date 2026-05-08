package com.rosadavi.portfolio_api.dto.stackDTO;

import java.util.UUID;

public record StackSummaryDTO(
        UUID id,
        String name,
        String use
) {
}
