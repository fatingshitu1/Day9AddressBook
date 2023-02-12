package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    Contact contact = new Contact();
    ArrayList<Contact> List = new ArrayList<>();

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    void addContact() {
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
        contact.setName(name);
        contact.setSurname(surname);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhone(phone);
        contact.setEmail(email);

    }

    public void editContact() {

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
        contact.setName(name);
        contact.setSurname(surname);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhone(phone);
        contact.setEmail(email);
    }

    public void deleteContact() {
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

//        public void addContact(){
//            scanner = new Scanner(System.in);
//            System.out.println("Enter First Name");
//            name = scanner.next();
//            System.out.println("Enter last Name");
//            surname = scanner.next();
//            System.out.println("Enter address");
//            address = scanner.next();
//            System.out.println("Enter city");
//            city = scanner.next();
//            System.out.println("Enter state");
//            state = scanner.next();
//            System.out.println("Enter zip");
//            zip = scanner.next();
//            System.out.println("Enter phone number");
//            phone = scanner.next();
//            System.out.println("Enter email");
//            email = scanner.next();
//            Contact contactList = new Contact();
//            List.add( contactList);
//        }
    }
}