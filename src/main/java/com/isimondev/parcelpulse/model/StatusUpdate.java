package com.isimondev.parcelpulse.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "staus_updates")
public class StatusUpdate {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "parcel_id", nullable = false)
  private Parcel parcel;

  @Column(nullable = false)
  private String status;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(nullable = false)
  private Date timestamp;

  // getter and setter methods
}