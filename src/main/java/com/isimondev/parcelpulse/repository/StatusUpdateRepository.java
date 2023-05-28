package com.isimondev.parcelpulse.repository;

import com.isimondev.parcelpulse.model.StatusUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusUpdateRepository extends JpaRepository<StatusUpdate, Long> {
}