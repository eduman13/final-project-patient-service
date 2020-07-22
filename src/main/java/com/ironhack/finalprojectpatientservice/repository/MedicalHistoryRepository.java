package com.ironhack.finalprojectpatientservice.repository;

import com.ironhack.finalprojectpatientservice.model.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {

    List<MedicalHistory> findAllByPatientId(Long patientId);
}
