package com.bridgelabz.addressbook;


public class Contact {
    // POJO => Plain old java object
    private String Name;
    private String surname;
    private String address;
    private String city;
    private String State;
    private String zip;
    private String phone;
    private String email;

    public Contact(String name, String surname, String address, String city, String state, String zip, String phone, String email) {
        this.Name = name;
        this.surname = surname;
        this.address = address;
        this.city = city;
        State = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

    }
}