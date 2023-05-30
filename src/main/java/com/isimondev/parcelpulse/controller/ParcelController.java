package com.isimondev.parcelpulse.controller;

import com.isimondev.parcelpulse.model.User;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isimondev.parcelpulse.model.Parcel;
import com.isimondev.parcelpulse.repository.ParcelRepository;
import com.isimondev.parcelpulse.repository.UserRepository;

@RestController
@RequestMapping("/api/parcels")
public class ParcelController {

  @Autowired
  private ParcelRepository parcelRepository;

  @Autowired
  private UserRepository userRepository;

  @PostMapping("/create")
  public ResponseEntity<?> createParcel(@RequestBody Parcel parcel, @RequestParam Long userId) {
    System.out.println("Creating parcel with trackingId " + parcel.getTrackingId());

    Optional<User> userOptional = userRepository.findById(userId);
    if (userOptional.isPresent()) {
      parcel.setUser(userOptional.get());
      Parcel savedParcel = parcelRepository.save(parcel);
      return ResponseEntity.ok(savedParcel);
    } else {
      return ResponseEntity.badRequest().body("User not found");
    }

  }

}
