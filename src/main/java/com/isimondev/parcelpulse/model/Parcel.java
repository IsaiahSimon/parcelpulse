package com.isimondev.parcelpulse.model;

import jakarta.persistence.*;

@Entity
@Table(name = "parcels")

public class Parcel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @Column(nullable = false, unique = true)
  private String trackingId;

  @Column(nullable = false)
  private String description;

  // getter and setter methods
}