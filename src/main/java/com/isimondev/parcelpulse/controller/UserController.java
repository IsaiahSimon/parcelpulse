package com.isimondev.parcelpulse.controller;

import org.springframework.web.bind.annotation.RestController;

import com.isimondev.parcelpulse.model.User;
import com.isimondev.parcelpulse.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController                                                     // tell Spring that this class will be used to handle HTTP requests.
@RequestMapping("/api/users")                                       // set the base URL for all endpoints in this controller
public class UserController {

  // inject the UserService into UserController
  private final UserService userService;

  @Autowired                                                        // automatically inject the UserService into the UserController
  public UserController(UserService userService){
    this.userService = userService;
  }

  // User Registration
  @PostMapping("/register")                                         // listen for POST requests at /api/users/register
  public ResponseEntity<?> register(@RequestBody User user){        // accept a User object in the request body
    // TODO: handle the response. Return the new user, or just a success message.
  }
}