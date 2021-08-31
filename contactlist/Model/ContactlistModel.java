package com.example.contactlist.Model;
import com.example.contactlist.Repository.ContactlistRepository;
import com.sun.jdi.IntegerType;
import com.sun.jdi.LongType;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import java.util.Scanner;
public class ContactlistModel {
   @Autowired
    ContactlistRepository contactlistRepository;


    public void addNewContact() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter contact name");
        String name = sc.nextLine();
        System.out.println("Enter contact phoneno");
        String phoneno = sc.nextLine();
        System.out.println("Enter contact emailid");
        String emailid = sc.nextLine();
        contactlistRepository.insertNewContactToDatabase(name,phoneno,emailid);
    }
    public void searchContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter contact phoneno");
        String phoneno = sc.nextLine();
        Contact contactname=contactlistRepository.searchContactInDatabase(phoneno);
        System.out.println(contactname.getName());
        System.out.println(contactname.getEmailid());
    }
    public void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter contact phoneno");
        String phoneno = sc.nextLine();
        contactlistRepository.deleteContactInDatabase(phoneno);

    }



}
