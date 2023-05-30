package com.isimondev.parcelpulse.model;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity // indicate that this class is a JPA entity
@Table(name = "users") // table this entity maps to

public class User {

  @Id // primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY) // value is auto generated
  private Long id;

  @Column(nullable = false, unique = true) // properties of the column
  private String username;

  @Column(nullable = false) // properties of the column
  private String password;

  @Column(nullable = false, unique = true) // properties of the column
  private String email;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JsonManagedReference
  private List<Parcel> parcels;

  // Getter and Setter methods
  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) { // using to set the hashed password before saving the User object to the
                                             // database
    this.password = password;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Parcel> getParcels() {
    return parcels;
  }

  public void setParcels(List<Parcel> parcels) {
    this.parcels = parcels;
  }
}
