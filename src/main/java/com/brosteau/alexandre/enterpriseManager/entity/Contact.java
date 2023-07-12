package com.brosteau.alexandre.enterpriseManager.entity;

import java.util.List;



public class Contact {

    private String address;
    private String lastname;
    private String firstName;
    private String isFreelance;
    private String tvaNumber;


    private List<Enterprise> listOfEnterprise;

    private long contactId;

    public Contact(String address, String lastname, String firstName) {
        this.address = address;
        this.lastname = lastname;
        this.firstName = firstName;
    }

    public Contact(String address, String lastname, String firstName, String isFreelance, String tvaNumber) {
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

    public String isFreelance() {
        return isFreelance;
    }

    public void setFreelance(String freelance) {
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

    @Override
    public String toString() {
        String infoContact =
                "Firstname : " + this.getFirstName() + "\n" +
                "Lastname : " + this.getLastname()  + "\n" +
                "Address :" + this.getAddress() + "\n" +
                "Is freelance : " + this.isFreelance + "\n" +
                "TVA number :" + this.getTvaNumber() + "\n";

        return infoContact;
    }
}
