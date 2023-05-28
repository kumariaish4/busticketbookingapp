package com.booking.repository;

import com.booking.entities.BusSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusSeatRepository extends JpaRepository<BusSeat, Long> {
}
