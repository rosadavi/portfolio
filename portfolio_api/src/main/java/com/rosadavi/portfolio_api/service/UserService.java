package com.rosadavi.portfolio_api.service;

import com.rosadavi.portfolio_api.dto.experienceDTO.ExperienceSummaryDTO;
import com.rosadavi.portfolio_api.dto.projectDTO.ProjectSummaryDTO;
import com.rosadavi.portfolio_api.dto.stackDTO.StackSummaryDTO;
import com.rosadavi.portfolio_api.dto.userDTO.UserCreateDTO;
import com.rosadavi.portfolio_api.dto.userDTO.UserResponseDTO;
import com.rosadavi.portfolio_api.entity.User;
import com.rosadavi.portfolio_api.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserCreateDTO save(User user) {
        User newUser = userRepository.save(user);

        return new UserCreateDTO(
                newUser.getName(),
                newUser.getDescription(),
                newUser.getTopic(),
                newUser.getGithub(),
                newUser.getEmail(),
                newUser.getPhone(),
                newUser.getLinkedin()
        );
    }

    public UserResponseDTO getUserByUserId(UUID user_id) {
        User user = userRepository.findById(user_id).orElseThrow(() -> new RuntimeException("User not found!"));

        return new UserResponseDTO(
                user.getId(),
                user.getName(),
                user.getDescription(),
                user.getTopic(),
                user.getGithub(),
                user.getEmail(),
                user.getPhone(),
                user.getLinkedin(),
                user.getProjects()
                        .stream()
                        .map(project -> new ProjectSummaryDTO(
                                project.getId(),
                                project.getTopic1(),
                                project.getTopic2(),
                                project.getTitle(),
                                project.getDescription()
                        ))
                        .toList(),
                user.getStacks()
                        .stream()
                        .map(stack -> new StackSummaryDTO(
                                stack.getId(),
                                stack.getName(),
                                stack.getUse()
                        ))
                        .toList(),
                user.getExperiences()
                        .stream()
                        .map(experience -> new ExperienceSummaryDTO(
                                experience.getId(),
                                experience.getName(),
                                experience.getEnterprise(),
                                experience.getDateInitial(),
                                experience.getDateEnd(),
                                experience.getActual()
                        ))
                        .toList()
        );
    }
}
