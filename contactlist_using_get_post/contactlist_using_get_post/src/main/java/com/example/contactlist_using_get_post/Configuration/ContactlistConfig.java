package com.example.contactlist_using_get_post.Configuration;
import com.example.contactlist_using_get_post.model.ContactlistModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class ContactlistConfig {
    @Bean
    public ContactlistModel contactlistModelObj() {
        return new ContactlistModel();
    }


}



