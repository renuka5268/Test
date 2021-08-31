package com.example.contactlist.Repository;

import com.example.contactlist.Model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ContactlistRepository {
    @Autowired

   JdbcTemplate jdbcTemplate;

    public void insertNewContactToDatabase(String name, String phoneno, String emailid) {
        String sql = "INSERT INTO contact(name,phoneno,emailid) VALUES(?,?,?)";
        Object params[] = new Object[] {name,phoneno,emailid };
        jdbcTemplate.update(sql,params);
        System.out.println("Contact sucessfully added!");
    }
    public Contact searchContactInDatabase(String phoneno) {
        String sql = " SELECT * FROM contact WHERE phoneno = ? ";
        Object params[] = new Object[] {phoneno};
        return jdbcTemplate.queryForObject(sql, params, BeanPropertyRowMapper.newInstance(Contact.class));

    }
    public  void  deleteContactInDatabase(String phoneno) {
        String sql = " DELETE FROM contact WHERE phoneno = ? ";
        Object params[] = new Object[] {phoneno};
        jdbcTemplate.execute(sql);
        System.out.println ("Contact details are  deleted successfully: ");


    }
}
