package com.ironhack.finalprojectpatientservice.service;

import com.ironhack.finalprojectpatientservice.model.Patient;
import com.ironhack.finalprojectpatientservice.model.dto.PatientDTO;
import com.ironhack.finalprojectpatientservice.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public PatientDTO findById(Long id) throws Exception {
        Patient patient = patientRepository.findById(id).orElseThrow(() -> new Exception("Not Found"));
        return PatientDTO.patientToPatientDTO(patient);
    }

    public PatientDTO findBySSN(String ssn) throws Exception {
        Patient patient = patientRepository.findBySocialSecurityNumber(ssn).orElseThrow(() -> new Exception("Not Found"));
        return PatientDTO.patientToPatientDTO(patient);
    }

    public List<PatientDTO> findPatientsByDoctor(Long doctorId) {
        return patientRepository.findAllByDoctorId(doctorId).stream().map(patient -> PatientDTO.patientToPatientDTO(patient)).collect(toList());
    }
}
