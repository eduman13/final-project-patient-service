package com.ironhack.finalprojectpatientservice.service;

import com.ironhack.finalprojectpatientservice.model.MedicalHistory;
import com.ironhack.finalprojectpatientservice.repository.MedicalHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedicalHistoryService {

    @Autowired
    PatientService patientService;

    @Autowired
    FamilyBackgroundSevice familiyBackgroundSevice;

    @Autowired
    MedicalHistoryRepository medicalHistoryRepository;

    public String findMedicalHistoryByPatient(Long patientId) {
        List<String> info = medicalHistoryRepository.findAllByPatientId(patientId).stream().map(MedicalHistory::getInformation).collect(Collectors.toList());
        StringBuffer buffer = new StringBuffer();
        info.forEach(s -> buffer.append(s));
        return buffer.toString();
    }

}
