package com.isimondev.parcelpulse.repository;

import com.isimondev.parcelpulse.model.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelRepository extends JpaRepository<Parcel, Long> {
  boolean existsByTrackingId(String trackingId);
}