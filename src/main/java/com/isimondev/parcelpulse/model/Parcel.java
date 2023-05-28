package com.isimondev.parcelpulse.model;

import jakarta.persistence.*;

@Entity                                                 // indicate that this class is a JPA entity
@Table(name = "parcels")                                // table this entity maps to

public class Parcel {

  @Id                                                   // primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY)   // value is auto generated
  private Long id;

  @ManyToOne                                            // relationship between parcels and users
  @JoinColumn(name = "user_id", nullable = false)       // column that is used for joining the User and Parcel entities
  private User user;

  @Column(nullable = false, unique = true)              // properties of the column
  private String trackingId;

  @Column(nullable = false)                             // properties of the column
  private String description;

  // getter and setter methods
}