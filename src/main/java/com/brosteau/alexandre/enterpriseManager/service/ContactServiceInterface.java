package com.brosteau.alexandre.enterpriseManager.service;

import com.brosteau.alexandre.enterpriseManager.entity.Contact;

import java.util.List;

public interface ContactServiceInterface {

    Contact createContact(Contact contact);
    void updateContact(Contact contact);
    boolean deleteContact(int contactId);

    List<Contact> getListOfContact();
}
