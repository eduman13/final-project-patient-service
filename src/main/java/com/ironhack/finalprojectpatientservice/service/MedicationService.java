package com.ironhack.finalprojectpatientservice.service;

import com.ironhack.finalprojectpatientservice.model.dto.MedicationDTO;
import com.ironhack.finalprojectpatientservice.repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicationService {

    @Autowired
    MedicationRepository medicationRepository;

    public MedicationDTO findByPatient(Long patientId) throws Exception {
        return MedicationDTO.medicationToMedicationDTO(medicationRepository.findById(patientId).orElseThrow(() -> new Exception("Not Found")));
    }
}
