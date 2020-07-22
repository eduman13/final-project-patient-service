package com.ironhack.finalprojectpatientservice.controller;

import com.ironhack.finalprojectpatientservice.service.MedicalHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

@RestController
public class MedicalHistoryController {

    @Autowired
    MedicalHistoryService medicalHistoryService;

    @GetMapping("/medical_history/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String findMedicalHistoryByPatient(@PathVariable("id") Long patientId) {
        return medicalHistoryService.findMedicalHistoryByPatient(patientId);
    }
}
