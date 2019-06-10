package com.edgenda.bnc.skillsmanager.model;

public enum EventStatus {

    CREATED("Created"),
    CANCELLED("Cancelled");


    private String value;

    EventStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
