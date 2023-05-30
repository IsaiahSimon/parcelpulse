package com.isimondev.parcelpulse.controller;

import org.springframework.web.bind.annotation.RestController;
import com.isimondev.parcelpulse.model.User;
import com.isimondev.parcelpulse.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/users")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/register")
  public ResponseEntity<User> register(@RequestBody User user) {
    User savedUser = userService.createUser(user);
    return ResponseEntity.ok(savedUser);
  }

  @PostMapping("/login")
  public ResponseEntity<?> authenticateUser(@RequestBody User user) {
    User existingUser = userService.findByUsername(user.getUsername());

    if (existingUser == null) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Username");
    }

    if (!existingUser.getPassword().equals(user.getPassword())) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Password");
    }

    return ResponseEntity.ok("User Authenticated Successfully");
  }

}
