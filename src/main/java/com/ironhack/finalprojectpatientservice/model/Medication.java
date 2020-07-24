package com.ironhack.finalprojectpatientservice.model;

import javax.persistence.*;

@Entity
public class Medication {

    @Id
    private Long Id;

    private String information;

    @OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
    @MapsId
    private Patient patient;

    public Medication() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
