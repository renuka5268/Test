package com.example.contactlist_using_get_post.Controller;
import com.example.contactlist_using_get_post.Repository.ContactlistRepository;
import com.example.contactlist_using_get_post.model.Contact;
import com.example.contactlist_using_get_post.model.ContactlistModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.relational.core.sql.Update;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.ui.Model;

import java.util.*;
import java.util.Scanner;

import static com.example.contactlist_using_get_post.model.Contact.getPhoneno;

@RestController
public class ContactlistController {


    @Autowired
    ContactlistModel contactlistModelObj;
    @Autowired
    ContactlistRepository contactlistRepository;


    @PostMapping(path = "/addNewContact")
    public String addNewContact(WebRequest WebRequest) {
        String name = WebRequest.getParameter("name");
        String phoneno = WebRequest.getParameter("phoneno");
        String emailid = WebRequest.getParameter("emailid");
        contactlistRepository.insertNewContactToDatabase(name,phoneno,emailid);
        String response ="Contact sucessfully added!" + Contact.getName() + " " + Contact.getPhoneno() + " " + Contact.getEmailid();
        return response;
    }
    @GetMapping(path = "/searchcontact")
    public String searchcontact(WebRequest WebRequest){
        String phoneno = WebRequest.getParameter("phoneno");
        contactlistRepository.searchContactInDtabase(phoneno);
        String response="contact details are : \n" + phoneno + " " + Contact.getName() + " " +Contact.getPhoneno() + " " + Contact.getEmailid();
        return response;
    }
    @PostMapping(path = "/updateContact")
    public String updateContact(WebRequest WebRequest) {
        String phoneno = WebRequest.getParameter("phoneno");
        String emailid = WebRequest.getParameter("emailid");
        contactlistRepository.updateNewContactToDtabase(emailid,phoneno);
        String response = "Contact sucessfully updated!" + Contact.getName() + Contact.getPhoneno() + " " + Contact.getEmailid();
        return response;
    }
}





