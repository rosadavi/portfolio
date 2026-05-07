package com.rosadavi.portfolio_api.dto.userDTO;

import com.rosadavi.portfolio_api.dto.experienceDTO.ExperienceSummaryDTO;
import com.rosadavi.portfolio_api.dto.projectDTO.ProjectSummaryDTO;
import com.rosadavi.portfolio_api.dto.stackDTO.StackSummaryDTO;

import java.util.List;

public record UserResponseDTO(
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
