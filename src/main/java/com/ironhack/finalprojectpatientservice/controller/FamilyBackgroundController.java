package com.ironhack.finalprojectpatientservice.controller;

import com.ironhack.finalprojectpatientservice.model.dto.FamilyBackgroundDTO;
import com.ironhack.finalprojectpatientservice.service.FamilyBackgroundSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FamilyBackgroundController {

    @Autowired
    FamilyBackgroundSevice familyBackgroundSevice;

    @GetMapping("/family_background/get_by_id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public FamilyBackgroundDTO getFamilyBackgroundById(@PathVariable("id") Long patientId) throws Exception {
        return familyBackgroundSevice.getFamilyBackgroundById(patientId);
    }
}
