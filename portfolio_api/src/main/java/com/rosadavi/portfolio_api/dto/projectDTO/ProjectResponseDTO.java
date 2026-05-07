package com.rosadavi.portfolio_api.dto.projectDTO;

import com.rosadavi.portfolio_api.dto.stackDTO.StackSummaryDTO;

import java.util.List;

public record ProjectResponseDTO(
        String topic1,
        String topic2,
        String title,
        String description,
        List<StackSummaryDTO> stack
) {
}