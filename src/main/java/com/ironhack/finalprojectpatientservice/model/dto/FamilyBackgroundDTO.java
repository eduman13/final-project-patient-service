package com.ironhack.finalprojectpatientservice.model.dto;

import com.ironhack.finalprojectpatientservice.model.FamilyBackground;

public class FamilyBackgroundDTO {

    private String information;

    public FamilyBackgroundDTO() {
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public static FamilyBackgroundDTO familyBackgroundToFamilyBackgroundDTO(FamilyBackground familyBackground) {
        FamilyBackgroundDTO familyBackgroundDTO = new FamilyBackgroundDTO();
            familyBackgroundDTO.setInformation(familyBackground.getInformation());
        return familyBackgroundDTO;
    }
}
