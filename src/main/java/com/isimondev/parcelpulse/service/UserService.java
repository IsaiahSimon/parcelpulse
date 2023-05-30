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

  // create a new user in database during signup
  public User createUser(User user) {
    return userRepository.save(user);
  }

  // fetch the user from the database during the login
  public User findByUsername(String username) {
    return userRepository.findByUsername(username);
  }
}
