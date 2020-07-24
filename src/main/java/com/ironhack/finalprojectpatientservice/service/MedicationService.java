package com.ironhack.finalprojectpatientservice.service;

import com.ironhack.finalprojectpatientservice.exception.NotFoundPatientException;
import com.ironhack.finalprojectpatientservice.model.dto.MedicationDTO;
import com.ironhack.finalprojectpatientservice.repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicationService {

    @Autowired
    MedicationRepository medicationRepository;

    public MedicationDTO findByPatient(Long patientId) throws NotFoundPatientException {
        return MedicationDTO.medicationToMedicationDTO(medicationRepository.findById(patientId).orElseThrow(() ->new NotFoundPatientException("Patient " + patientId + " does not exist")));
    }

}
