package com.ironhack.finalprojectpatientservice.service;

import com.ironhack.finalprojectpatientservice.exception.NotFoundPatientException;
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

    @Autowired
    FamilyBackgroundSevice familyBackgroundSevice;

    @Autowired
    MedicationService medicationService;

    public PatientDTO findById(Long id) throws NotFoundPatientException {
        Patient patient = patientRepository.findById(id).orElseThrow(() -> new NotFoundPatientException("Patient " + id + " does not exist"));
        return PatientDTO.patientToPatientDTO(patient);
    }

    public PatientDTO findBySSN(String ssn) throws NotFoundPatientException {
        Patient patient = patientRepository.findBySocialSecurityNumber(ssn).orElseThrow(() -> new NotFoundPatientException("Patient with Social Security Number " + ssn + " does not exist"));
        return PatientDTO.patientToPatientDTO(patient);
    }

    public List<PatientDTO> findPatientsByDoctor(Long doctorId) {
        return patientRepository.findAllByDoctorId(doctorId).stream().map(patient -> PatientDTO.patientToPatientDTO(patient)).collect(toList());
    }

    public List<PatientDTO> findAll() {
        return patientRepository.findAll().stream().map(PatientDTO::patientToPatientDTO).collect(toList());
    }

    public void deletePatient(Long patientId) {
        patientRepository.deleteById(patientId);
    }

    public void createPatient(PatientDTO patientDTO) {
        patientRepository.save(PatientDTO.patientDTOToPatient(patientDTO));
    }
}
