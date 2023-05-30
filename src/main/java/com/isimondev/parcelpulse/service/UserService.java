package com.isimondev.parcelpulse.service;

import com.isimondev.parcelpulse.model.User;
import com.isimondev.parcelpulse.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }
}
