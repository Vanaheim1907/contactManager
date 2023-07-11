package com.brosteau.alexandre.enterpriseManager.service;

import com.brosteau.alexandre.enterpriseManager.entity.Contact;
import com.brosteau.alexandre.enterpriseManager.entity.Enterprise;

public interface EnterpriseServiceInterface {

    void addContact(Contact contact);
    int createEnterprise(String name, String tvaNumber);
    void updateEnterprise(String name, String tvaNumber);
    Enterprise searchEnterprise(String tvaNumber);



}
