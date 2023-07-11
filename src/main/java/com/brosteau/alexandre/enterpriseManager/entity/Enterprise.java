package com.brosteau.alexandre.enterpriseManager.entity;

import java.util.List;

public class Enterprise {

    private String tvaNumber;
    private String name;
    private long enterpriseId;

    private List<Contact> listOfContacts;

    public Enterprise(String tvaNumber, String name) {
        this.tvaNumber = tvaNumber;
        this.name = name;
        this.enterpriseId++;
    }

    public String getTvaNumber() {
        return tvaNumber;
    }

    public void setTvaNumber(String tvaNumber) {
        this.tvaNumber = tvaNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
