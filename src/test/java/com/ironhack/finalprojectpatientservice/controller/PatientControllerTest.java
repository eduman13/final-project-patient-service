package com.ironhack.finalprojectpatientservice.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.finalprojectpatientservice.model.dto.PatientDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class PatientControllerTest {

    @Autowired
    WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setUp() {
        this.mockMvc = MockMvcBuilders
                .webAppContextSetup(webApplicationContext)
                .build();
    }

    @Test
    void findById() throws Exception {
        this.mockMvc.perform(get("/patient/find_by_id/1"))
                .andExpect(status().isOk());
    }

    @Test
    void testFindBySSN() throws Exception {
        this.mockMvc.perform(get("/patient/find_by_ssn")
                .param("ssn", "812315676513A"))
                .andExpect(status().isOk());
    }

    @Test
    void findAllByDoctorId() throws Exception {
        this.mockMvc.perform(get("/patient/find_all_by_doctor/1"))
                .andExpect(status().isOk());
    }

    @Test
    void findAll() throws Exception {
        this.mockMvc.perform(get("/patient/find_all"))
                .andExpect(status().isOk());
    }

    @Test
    void deletePatient() throws Exception {
        this.mockMvc.perform(delete("/patient/delete/9"))
                .andExpect(status().isNoContent());
    }

    @Test
    void createPatient() throws Exception  {
        PatientDTO patientDTO = new PatientDTO();
            patientDTO.setName("Eduardo");
            patientDTO.setSurnames("García Espeso");
            patientDTO.setSocialSecurityNumber("234343454567T");
            patientDTO.setStreet("Avenida Ámerica");
            patientDTO.setPortal(20);
            patientDTO.setNumber(5);
            patientDTO.setPhoto("photo");
            patientDTO.setDoctorId((long) 1);
        this.mockMvc.perform(post("/patient/create")
                .content(objectMapper.writeValueAsString(patientDTO))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }
}