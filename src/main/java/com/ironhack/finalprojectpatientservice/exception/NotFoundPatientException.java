package com.ironhack.finalprojectpatientservice.exception;

public class NotFoundPatientException extends Exception {

    public NotFoundPatientException(String errorMessage) {
        super(errorMessage);
    }
}
