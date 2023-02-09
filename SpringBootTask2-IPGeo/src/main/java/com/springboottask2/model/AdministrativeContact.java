package com.springboottask2.model;

public class AdministrativeContact {
    private String name;
    private String company;
    private String street;
    private String city;
    private String state;
    private String zip_code;
    private String country_name;
    private String country_code;
    private String email_address;
    private String phone;

    public AdministrativeContact(String name, String company, String street, String city, String state, String zip_code, String country_name, String country_code, String email_address, String phone) {
        this.name = name;
        this.company = company;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
        this.country_name = country_name;
        this.country_code = country_code;
        this.email_address = email_address;
        this.phone = phone;
    }

    public AdministrativeContact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", country_name='" + country_name + '\'' +
                ", country_code='" + country_code + '\'' +
                ", email_address='" + email_address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
