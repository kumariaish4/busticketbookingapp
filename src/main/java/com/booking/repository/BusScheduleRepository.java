package com.booking.repository;

import com.booking.entities.BusSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BusScheduleRepository extends JpaRepository<BusSchedule, Long> {
}

