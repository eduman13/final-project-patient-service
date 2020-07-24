package com.ironhack.finalprojectpatientservice.model.dto;

import com.ironhack.finalprojectpatientservice.model.Address;
import com.ironhack.finalprojectpatientservice.model.Patient;

import java.time.LocalDate;
import java.util.Optional;

public class PatientDTO {

    private Long id;
    private String photo;
    private String name;
    private String surnames;
    private String socialSecurityNumber;
    private LocalDate birthday;
    private Integer number;
    private Integer portal;
    private String street;
    private Long doctorId;

    public PatientDTO() {
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getPortal() {
        return portal;
    }

    public void setPortal(Integer portal) {
        this.portal = portal;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public static PatientDTO patientToPatientDTO(Patient patient) {
        PatientDTO patientDTO = new PatientDTO();
            patientDTO.setId(patient.getId());
            patientDTO.setPhoto(patient.getPhoto());
            patientDTO.setName(patient.getName());
            patientDTO.setSurnames(patient.getSurnames());
            patientDTO.setBirthday(patient.getBirthday());
            patientDTO.setSocialSecurityNumber(patient.getSocialSecurityNumber());
            patientDTO.setNumber(patient.getAddress().getNumber());
            patientDTO.setPortal(patient.getAddress().getPortal());
            patientDTO.setStreet(patient.getAddress().getStreet());
        return patientDTO;
    }

    public static Patient patientDTOToPatient(PatientDTO patientDTO) {
        Patient patient = new Patient();
            patient.setName(patientDTO.getName());
            patient.setSurnames(patientDTO.getSurnames());
            patient.setBirthday(patientDTO.getBirthday());
            patient.setSocialSecurityNumber(patientDTO.getSocialSecurityNumber());
        Address address = new Address();
            address.setStreet(patientDTO.getStreet());
            address.setPortal(patientDTO.getPortal());
            address.setNumber(patientDTO.getNumber());
            patient.setAddress(address);
        if (Optional.ofNullable(patientDTO.getDoctorId()).isPresent()) {
           patient.setDoctorId(patientDTO.getDoctorId());
        }
        if (Optional.ofNullable(patientDTO.getPhoto()).isPresent()) {
            patient.setPhoto(patientDTO.getPhoto());
        }
        return patient;
    }
}
