package com.bridgelabz.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book program");

        AddressBook addressBook1 = new AddressBook();
//        System.out.println(addressBook1.contact.getName());
//        System.out.println(addressBook1.contact.getSurname());
//        System.out.println(addressBook1.contact.getAddress());
//        System.out.println(addressBook1.contact.getCity());
//        System.out.println(addressBook1.contact.getState());
//        System.out.println(addressBook1.contact.getZip());
//        System.out.println(addressBook1.contact.getPhone());
//        System.out.println(addressBook1.contact.getEmail());

        addressBook1.addContact();
        System.out.println();
        System.out.println(addressBook1.contact.getName());
        System.out.println(addressBook1.contact.getSurname());
        System.out.println(addressBook1.contact.getAddress());
        System.out.println(addressBook1.contact.getCity());
        System.out.println(addressBook1.contact.getState());
        System.out.println(addressBook1.contact.getZip());
        System.out.println(addressBook1.contact.getPhone());
        System.out.println(addressBook1.contact.getEmail());

        addressBook1.editContact();
        System.out.println();

        System.out.println(addressBook1.contact.getName());
        System.out.println(addressBook1.contact.getSurname());
        System.out.println(addressBook1.contact.getAddress());
        System.out.println(addressBook1.contact.getCity());
        System.out.println(addressBook1.contact.getState());
        System.out.println(addressBook1.contact.getZip());
        System.out.println(addressBook1.contact.getPhone());
        System.out.println(addressBook1.contact.getEmail());

        addressBook1.deleteContact();
        System.out.println();

        System.out.println(addressBook1.contact.getName());
        System.out.println(addressBook1.contact.getSurname());
        System.out.println(addressBook1.contact.getAddress());
        System.out.println(addressBook1.contact.getCity());
        System.out.println(addressBook1.contact.getState());
        System.out.println(addressBook1.contact.getZip());
        System.out.println(addressBook1.contact.getPhone());
        System.out.println(addressBook1.contact.getEmail());

        addressBook1.addContact();
        addressBook1.addContact();
        System.out.println();

        System.out.println(addressBook1.contact.getName());
        System.out.println(addressBook1.contact.getSurname());
        System.out.println(addressBook1.contact.getAddress());
        System.out.println(addressBook1.contact.getCity());
        System.out.println(addressBook1.contact.getState());
        System.out.println(addressBook1.contact.getZip());
        System.out.println(addressBook1.contact.getPhone());
        System.out.println(addressBook1.contact.getEmail());
    }
}
