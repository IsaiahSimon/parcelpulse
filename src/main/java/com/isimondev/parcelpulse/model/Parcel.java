package com.isimondev.parcelpulse.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity // indicate that this class is a JPA entity
@Table(name = "parcels") // table this entity maps to

public class Parcel {

  @Id // primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY) // value is auto generated
  private Long id;

  @Column(nullable = false, unique = true)
  private String trackingId;

  @Column(nullable = false)
  private String description;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  @JsonBackReference
  private User user;

  // getter and setter methods
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }

  public String getDescription() {
    return description;

  }

  public void setDescription(String description) {
    this.description = description;
  }
}