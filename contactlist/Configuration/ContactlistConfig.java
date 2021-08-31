package com.example.contactlist.Configuration;
import com.example.contactlist.Model.ContactlistModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class ContactlistConfig {
    @Bean
    public ContactlistModel contactlistModelObj() {
        return new ContactlistModel();
    }
}
