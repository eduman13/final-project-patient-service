package com.ironhack.finalprojectpatientservice.model.dto;

import com.ironhack.finalprojectpatientservice.model.MedicalHistory;

public class MedicalHitoryDTO {

    private String info;

    public MedicalHitoryDTO() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static MedicalHitoryDTO medicalhistorytoMedicalhitorydto(MedicalHistory medicalHistory) {
        MedicalHitoryDTO medicalHitoryDTO = new MedicalHitoryDTO();
            medicalHitoryDTO.setInfo(medicalHistory.getInformation());
        return medicalHitoryDTO;
    }
}
