package com.brosteau.alexandre.enterpriseManager;

import com.brosteau.alexandre.enterpriseManager.controller.ContactConsolController;
import com.brosteau.alexandre.enterpriseManager.entity.Contact;
import com.brosteau.alexandre.enterpriseManager.service.ContactServiceImpl;
import com.brosteau.alexandre.enterpriseManager.service.ContactServiceInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class EnterpriseManagerApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EnterpriseManagerApplication.class, args);

		ContactConsolController controller = context.getBean(ContactConsolController.class);
		System.out.println(controller.getContactList().toString());

	}

}
