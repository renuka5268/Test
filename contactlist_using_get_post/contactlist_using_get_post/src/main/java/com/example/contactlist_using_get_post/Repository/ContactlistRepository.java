package com.example.contactlist_using_get_post.Repository;
import com.example.contactlist_using_get_post.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public class ContactlistRepository  {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @GetMapping
    public void insertNewContactToDatabase(String name, String phoneno, String emailid) {
        String sql = "INSERT INTO contact(name,phoneno,emailid) VALUES(?,?,?)";
        Object params[] = new Object[] {name,phoneno,emailid };
        jdbcTemplate.update(sql,params);

    }
    @GetMapping
    public void searchContactInDtabase(String phoneno){
        String sql="select * from contact where phoneno='+phoneno+' ";
        Object params[] = new Object[] {phoneno };
        jdbcTemplate.execute(sql);
    }
    @GetMapping
    public void updateNewContactToDtabase(String phoneno,String emailid){
        String sql="update contact set emailid='\"+emailid+\"' where phoneno='\"+phoneno+\"' ";
        Object params[] = new Object[] {emailid,phoneno };
        jdbcTemplate.execute(sql);
    }


}
