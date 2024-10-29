package com.pjsoft.fms.repository;

import com.pjsoft.fms.model.Passanger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassangerRepository extends JpaRepository<Passanger, Long> {
}