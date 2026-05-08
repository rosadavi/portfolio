package com.rosadavi.portfolio_api.dto.userDTO;

import com.rosadavi.portfolio_api.dto.experienceDTO.ExperienceSummaryDTO;
import com.rosadavi.portfolio_api.dto.projectDTO.ProjectSummaryDTO;
import com.rosadavi.portfolio_api.dto.stackDTO.StackSummaryDTO;

import java.util.List;
import java.util.UUID;

public record UserResponseDTO(
        UUID id,
        String name,
        String description,
        String topic,
        String github,
        String email,
        String phone,
        String linkedin,
        List<ProjectSummaryDTO> project,
        List<StackSummaryDTO> stack,
        List<ExperienceSummaryDTO> experience
) {
}
