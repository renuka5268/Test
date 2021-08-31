package com.example.contactlist.Control;
import com.example.contactlist.Model.ContactlistModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import java.util.*;
import java.util.Scanner;

@Controller
public class ContactlistControl implements CommandLineRunner{


        @Autowired
        ContactlistModel contactlistModelObj;

        @Override
        public void run(String... args) throws Exception {
            System.out.println("Welcome to SpringBoot\n\n\n\n");
            Scanner sc = new Scanner(System.in);

            System.out.println("----MENU-----");
            System.out.println("1. Add new Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. delete Contact");

            boolean menu = true;

            while (menu) {
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Adding new contact");
                        contactlistModelObj.addNewContact();
                        break;
                    case 2:
                        System.out.println("searching for contact");
                        contactlistModelObj.searchContact();
                    case 3:
                        System.out.println("delete contact");
                        contactlistModelObj.deleteContact();
                    case 4:
                        menu = false;
                    default:
                        break;
                }
            }
            System.exit(0);
        }
    }


