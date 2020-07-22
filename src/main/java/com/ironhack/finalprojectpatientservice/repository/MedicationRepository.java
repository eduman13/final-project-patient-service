package com.ironhack.finalprojectpatientservice.repository;

import com.ironhack.finalprojectpatientservice.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationRepository extends JpaRepository<Medication, Long> {
}
