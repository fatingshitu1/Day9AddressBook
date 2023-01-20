package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {

    Contact contact = new Contact();

     void addContact(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter First Name");
         String name = scanner.next();
         System.out.println("Enter last Name");
         String surname = scanner.next();
         System.out.println("Enter address");
         String address = scanner.next();
         System.out.println("Enter city");
         String city = scanner.next();
         System.out.println("Enter state");
         String state = scanner.next();
         System.out.println("Enter zip");
         String zip = scanner.next();
         System.out.println("Enter phone number");
         String phone = scanner.next();
         System.out.println("Enter email");
         String email = scanner.next();
     }
}

