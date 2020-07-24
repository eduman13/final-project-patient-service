package com.ironhack.finalprojectpatientservice.controller;

import com.ironhack.finalprojectpatientservice.exception.NotFoundPatientException;
import com.ironhack.finalprojectpatientservice.model.dto.MedicationDTO;
import com.ironhack.finalprojectpatientservice.service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicationController {

    @Autowired
    MedicationService medicationService;

    @GetMapping("/medication/find_by_patient/{id}")
    @ResponseStatus(HttpStatus.OK)
        public MedicationDTO findByPatient(@PathVariable("id") Long patientId) throws NotFoundPatientException {
        return medicationService.findByPatient(patientId);
    }
}
