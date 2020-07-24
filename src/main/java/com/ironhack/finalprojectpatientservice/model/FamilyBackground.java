package com.ironhack.finalprojectpatientservice.model;

import javax.persistence.*;

@Entity
public class FamilyBackground {

    @Id
    private Long id;

    private String information;

    @OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
    @MapsId
    private Patient patient;

    public FamilyBackground() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
