package com.brosteau.alexandre.enterpriseManager.repository;

import com.brosteau.alexandre.enterpriseManager.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DBRepositoryImpl implements DBRepositoryInterface {


    private final JdbcTemplate jdbcTemplate;

    public DBRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createContact(Contact contact) {


        jdbcTemplate.update("INSERT INTO enterprisemanager.contact " +
        "                        (Address, firstname, lastname, isFreelance, tvaNumber" + " values (?,?,?,?,?)",
                contact.getAddress(),contact.getFirstName(), contact.getLastname(), contact.isFreelance(),contact.getTvaNumber());

        System.out.println("Contact inserted" + contact.toString());
    }

    @Override
    public List<Contact> getAllContact() {

        List<Contact> contactList = new ArrayList<Contact>();
        return  this.jdbcTemplate.query("Select * from enterprisemanager.contact", (rs,rowNum) -> new
               Contact(
                (String.valueOf(rs.getInt("CONTACT_ID"))),
                (rs.getString("firstname")),
                (rs.getString("lastname")),
                (rs.getBoolean("isFreelance")),
                (rs.getString("tvaNumber"))));
       }
    }
