package com.isimondev.parcelpulse.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity                                                 // indicate that this class is a JPA entity
@Table(name = "staus_updates")                          // table this entity maps to
public class StatusUpdate {

  @Id                                                   // primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY)   // value is auto generated
  private Long id;

  @ManyToOne                                            // relationship with the Parcel entity
  @JoinColumn(name = "parcel_id", nullable = false)     // column that is used for joining the Parcel and StatusUpdate entities
  private Parcel parcel;

  @Column(nullable = false)                             // properties of the column
  private String status;

  @Temporal(TemporalType.TIMESTAMP)                     // type of temporal field
  @Column(nullable = false)                             // properties of the column
  private Date timestamp;

  // getter and setter methods
}
