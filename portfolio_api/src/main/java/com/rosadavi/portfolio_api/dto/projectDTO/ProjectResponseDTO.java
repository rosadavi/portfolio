package com.rosadavi.portfolio_api.dto.projectDTO;

import com.rosadavi.portfolio_api.dto.stackDTO.StackSummaryDTO;

import java.util.List;
import java.util.UUID;

public record ProjectResponseDTO(
        UUID id,
        String topic1,
        String topic2,
        String title,
        String description,
        List<StackSummaryDTO> stack
) {
}