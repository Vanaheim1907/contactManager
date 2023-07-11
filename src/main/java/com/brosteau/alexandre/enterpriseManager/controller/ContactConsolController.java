package com.brosteau.alexandre.enterpriseManager.controller;

import com.brosteau.alexandre.enterpriseManager.entity.Contact;
import com.brosteau.alexandre.enterpriseManager.service.ContactServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;

@Controller
public class ContactConsolController {


    private final ContactServiceInterface contactService;

    public ContactConsolController(ContactServiceInterface contactService) {
        this.contactService = contactService;
    }

    public Contact createContact(){
        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ajouter un contact");
        System.out.println("Quel est le prénom ?");
        contact.setFirstName(scanner.nextLine());
        System.out.println("Quel est le nom de famille");
        contact.setLastname(scanner.nextLine());
        System.out.println("Quel est l'adresse?'");
        contact.setAddress(scanner.nextLine());
        System.out.println("est-il freelance ?");
        switch (scanner.nextLine()) {
            case "oui":
                contact.setFreelance(true);
                System.out.println("Quel est son numéro de TVA");
                contact.setTvaNumber(scanner.nextLine());

            case "non": contact.setFreelance(false);
            default: contact.setFreelance(false);
        }
        return contactService.createContact(contact);
    }

    public List<Contact> getContactList(){

        return contactService.getListOfContact();
    }



}
