package com.bridgelabz.addressbook;


public class AddressBookProblem {
    private String Name;
    private String surname;
    private String address;
    private String city;
    private String State;
    private String zip;
    private String phone;
    private String email;

    public AddressBookProblem(String name, String surname, String address, String city, String state, String zip, String phone, String email) {
        this.Name = name;
        this.surname = surname;
        this.address = address;
        this.city = city;
        State = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        System.out.println("Show the Person first name");
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return State;
    }

    public String getZip() {
        return zip;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void ContactDetails() {

    }
}
