package com.ironhack.finalprojectpatientservice.model.dto;

import com.ironhack.finalprojectpatientservice.model.Medication;

public class MedicationDTO {

    private String info;

    public MedicationDTO() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static MedicationDTO medicationToMedicationDTO(Medication medication) {
        MedicationDTO medicationDTO = new MedicationDTO();
            medicationDTO.setInfo(medication.getInformation());
        return medicationDTO;
    }
}
