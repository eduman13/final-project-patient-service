package com.ironhack.finalprojectpatientservice.repository;

import com.ironhack.finalprojectpatientservice.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    Optional<Patient> findBySocialSecurityNumber(String ssn);

    List<Patient> findAllByDoctorId(Long id);
}
