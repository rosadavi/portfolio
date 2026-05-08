package com.rosadavi.portfolio_api.dto.stackDTO;

import java.util.UUID;

public record StackResponseDTO(
        UUID id,
        String name,
        String use
) {
}