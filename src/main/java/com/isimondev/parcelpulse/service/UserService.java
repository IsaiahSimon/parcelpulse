package com.isimondev.parcelpulse.service;

import com.isimondev.parcelpulse.model.User;
import com.isimondev.parcelpulse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service                                                // mark the UserService class as a service that contains business logic
public class UserService {
  private final UserRepository userRepository;

  @Autowired                                            // automatically inject the UserRepository into the UserService
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User register(User user) {
    // TODO: add any necessary logic to prepare the user for registration
        // encrypt the user's password

        // save the user to the database
        return userRepository.save(user);
  }
}
