package com.pjsoft.fms.repository;

import com.pjsoft.fms.model.Booking;
import com.pjsoft.fms.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}