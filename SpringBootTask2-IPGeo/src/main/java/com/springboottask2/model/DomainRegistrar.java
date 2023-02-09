package com.springboottask2.model;

public class DomainRegistrar {
    private int iana_id;
    private String registrar_name;
    private String whois_server;
    private String website_url;
    private String email_address;
    private String phone_number;

    public DomainRegistrar(int iana_id, String registrar_name, String whois_server, String website_url, String email_address, String phone_number) {
        this.iana_id = iana_id;
        this.registrar_name = registrar_name;
        this.whois_server = whois_server;
        this.website_url = website_url;
        this.email_address = email_address;
        this.phone_number = phone_number;
    }

    public DomainRegistrar() {
    }

    public int getIana_id() {
        return iana_id;
    }

    public void setIana_id(int iana_id) {
        this.iana_id = iana_id;
    }

    public String getRegistrar_name() {
        return registrar_name;
    }

    public void setRegistrar_name(String registrar_name) {
        this.registrar_name = registrar_name;
    }

    public String getWhois_server() {
        return whois_server;
    }

    public void setWhois_server(String whois_server) {
        this.whois_server = whois_server;
    }

    public String getWebsite_url() {
        return website_url;
    }

    public void setWebsite_url(String website_url) {
        this.website_url = website_url;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "{" +
                "iana_id=" + iana_id +
                ", registrar_name='" + registrar_name + '\'' +
                ", whois_server='" + whois_server + '\'' +
                ", website_url='" + website_url + '\'' +
                ", email_address='" + email_address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
