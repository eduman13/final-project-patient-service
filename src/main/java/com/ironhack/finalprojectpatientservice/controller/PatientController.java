package com.ironhack.finalprojectpatientservice.controller;

import com.ironhack.finalprojectpatientservice.model.dto.PatientDTO;
import com.ironhack.finalprojectpatientservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("/patient/find_by_id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PatientDTO findById(@PathVariable Long id) throws Exception {
        return patientService.findById(id);
    }

    @GetMapping("/patient/find_by_ssn")
    @ResponseStatus(HttpStatus.OK)
    public PatientDTO findById(@RequestParam String ssn) throws Exception {
        return patientService.findBySSN(ssn);
    }

    @GetMapping("/patient/find_all_by_doctor/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<PatientDTO> findAllByDoctorId(@PathVariable("id") Long doctorId) {
        return patientService.findPatientsByDoctor(doctorId);
    }
}
