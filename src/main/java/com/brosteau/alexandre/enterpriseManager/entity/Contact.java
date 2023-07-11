package com.brosteau.alexandre.enterpriseManager.entity;

import java.util.List;

public class Contact {

    private String address;
    private String lastname;
    private String firstName;
    private boolean isFreelance;
    private String tvaNumber;


    private List<Enterprise> listOfEnterprise;

    private long contactId;

    public Contact(String address, String lastname, String firstName) {
        this.address = address;
        this.lastname = lastname;
        this.firstName = firstName;
    }

    public Contact(String address, String lastname, String firstName, boolean isFreelance, String tvaNumber) {
        this.address = address;
        this.lastname = lastname;
        this.firstName = firstName;
        this.isFreelance = isFreelance;
        this.tvaNumber = tvaNumber;
        this.setContactId(this.contactId++);
    }

    public Contact() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isFreelance() {
        return isFreelance;
    }

    public void setFreelance(boolean freelance) {
        isFreelance = freelance;
    }

    public String getTvaNumber() {
        return tvaNumber;
    }

    public void setTvaNumber(String tvaNumber) {
        this.tvaNumber = tvaNumber;
    }

    public long getContactId() {
        return contactId;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
    }
}
