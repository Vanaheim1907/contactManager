package com.brosteau.alexandre.enterpriseManager.repository;

import com.brosteau.alexandre.enterpriseManager.entity.Contact;


import java.util.List;

public interface DBRepositoryInterface {
    void createContact(Contact contact);
    List<Contact> getAllContact();


}
