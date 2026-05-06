package com.rosadavi.portfolio_api.service;

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

    public User save(User user) {
        return userRepository.save(user);
    }

    public User getUserByUserId(UUID user_id) {
        return userRepository.findById(user_id).orElseThrow(() -> new RuntimeException("User not found!"));
    }
}
