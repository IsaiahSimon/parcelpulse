package com.isimondev.parcelpulse.model;

import jakarta.persistence.*;

@Entity                                                 // indicate that this class is a JPA entity
@Table(name = "users")                                  // table this entity maps to

public class User {

  @Id                                                  // primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY)  // value is auto generated
  private Long id;

  @Column(nullable = false, unique = true)             // properties of the column
  private String username;

  @Column(nullable = false)                           // properties of the column
  private String password;

  @Column(nullable = false, unique = true)            // properties of the column
  private String email;

  // getter and setter methods
}
