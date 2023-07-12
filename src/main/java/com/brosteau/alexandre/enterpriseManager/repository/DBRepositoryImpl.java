package com.brosteau.alexandre.enterpriseManager.repository;

import com.brosteau.alexandre.enterpriseManager.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DBRepositoryImpl implements DBRepositoryInterface {


    private final JdbcTemplate jdbcTemplate;
    private static final String INSERT_QUERY = "INSERT INTO contact(Address, firstname, lastname, isFreelance, tvaNumber) values (?,?,?,?,?)";

    public DBRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createContact(Contact contact) {

        try {
            PreparedStatement preparedStatement = jdbcTemplate.getDataSource().getConnection().prepareStatement(INSERT_QUERY);
            preparedStatement.setString(1,contact.getAddress());
            preparedStatement.setString(2,contact.getFirstName());
            preparedStatement.setString(3,contact.getLastname());
            preparedStatement.setString(4,contact.isFreelance());
            preparedStatement.setString(5,contact.getTvaNumber());

            preparedStatement.executeUpdate();
        }catch (SQLException e){
            System.err.format("SQL State: %s \n %s",e.getSQLState(),e.getMessage());
        }

        System.out.println("Contact inserted" + contact.toString());
    }

    @Override
    public List<Contact> getAllContact() {

        List<Contact> contactList = new ArrayList<Contact>();
        return  this.jdbcTemplate.query("Select * from contact", (rs,rowNum) -> new
               Contact(
                (String.valueOf(rs.getInt("CONTACT_ID"))),
                (rs.getString("firstname")),
                (rs.getString("lastname")),
                (rs.getString("isFreelance")),
                (rs.getString("tvaNumber"))));
       }
    }
