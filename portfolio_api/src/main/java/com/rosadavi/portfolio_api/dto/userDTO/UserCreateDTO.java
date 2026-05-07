package com.rosadavi.portfolio_api.dto.userDTO;

public record UserCreateDTO(
        String name,
        String description,
        String topic,
        String github,
        String email,
        String phone,
        String linkedin
) {
}
