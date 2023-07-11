package com.brosteau.alexandre.enterpriseManager.service;

import com.brosteau.alexandre.enterpriseManager.entity.Contact;
import com.brosteau.alexandre.enterpriseManager.repository.DBRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactServiceInterface{

    private final DBRepositoryImpl repository;

    public ContactServiceImpl(DBRepositoryImpl repository) {
        this.repository = repository;
    }

    public DBRepositoryImpl getRepository() {
        return repository;
    }


    @Override
    public Contact createContact(Contact contact) {
        repository.createContact(contact);
        return contact;
    }

    @Override
    public void updateContact(Contact contact) {

    }

    @Override
    public boolean deleteContact(int contactId) {
        return false;
    }

    @Override
    public List<Contact> getListOfContact() {
        return repository.getAllContact();
    }
}
