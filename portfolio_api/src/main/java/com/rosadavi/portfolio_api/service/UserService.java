package com.rosadavi.portfolio_api.service;

import com.rosadavi.portfolio_api.entity.User;
import com.rosadavi.portfolio_api.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
