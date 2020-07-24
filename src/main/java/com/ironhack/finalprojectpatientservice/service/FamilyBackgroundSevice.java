package com.ironhack.finalprojectpatientservice.service;

import com.ironhack.finalprojectpatientservice.exception.NotFoundPatientException;
import com.ironhack.finalprojectpatientservice.model.dto.FamilyBackgroundDTO;
import com.ironhack.finalprojectpatientservice.repository.FamilyBackgroundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyBackgroundSevice {

    @Autowired
    FamilyBackgroundRepository familyBackgroundRepository;

    public FamilyBackgroundDTO getFamilyBackgroundById(Long id) throws NotFoundPatientException {
        return FamilyBackgroundDTO.familyBackgroundToFamilyBackgroundDTO(familyBackgroundRepository.findById(id).orElseThrow(() -> new NotFoundPatientException("Patient " + id + " does not exist")));
    }

}
