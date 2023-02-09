package com.springboottask2.model;

import java.util.Arrays;

public class RegistryData {
    private String domain_name;
    private String query_time;
    private String whois_server;
    private String domain_registered;
    private DomainRegistrar domain_registrar;
    private String[] name_servers;
    private String[] domain_status;
    private String whois_raw_registery;

    public RegistryData(String domain_name, String query_time, String whois_server, String domain_registered, DomainRegistrar domain_registrar, String[] name_servers, String[] domain_status, String whois_raw_registery) {
        this.domain_name = domain_name;
        this.query_time = query_time;
        this.whois_server = whois_server;
        this.domain_registered = domain_registered;
        this.domain_registrar = domain_registrar;
        this.name_servers = name_servers;
        this.domain_status = domain_status;
        this.whois_raw_registery = whois_raw_registery;
    }

    public RegistryData() {
    }

    public String getDomain_name() {
        return domain_name;
    }

    public void setDomain_name(String domain_name) {
        this.domain_name = domain_name;
    }

    public String getQuery_time() {
        return query_time;
    }

    public void setQuery_time(String query_time) {
        this.query_time = query_time;
    }

    public String getWhois_server() {
        return whois_server;
    }

    public void setWhois_server(String whois_server) {
        this.whois_server = whois_server;
    }

    public String getDomain_registered() {
        return domain_registered;
    }

    public void setDomain_registered(String domain_registered) {
        this.domain_registered = domain_registered;
    }

    public DomainRegistrar getDomain_registrar() {
        return domain_registrar;
    }

    public void setDomain_registrar(DomainRegistrar domain_registrar) {
        this.domain_registrar = domain_registrar;
    }

    public String[] getName_server() {
        return name_servers;
    }

    public void setName_server(String[] name_servers) {
        this.name_servers = name_servers;
    }

    public String[] getDomain_status() {
        return domain_status;
    }

    public void setDomain_status(String[] domain_status) {
        this.domain_status = domain_status;
    }

    public String getWhois_raw_registery() {
        return whois_raw_registery;
    }

    public void setWhois_raw_registery(String whois_raw_registery) {
        this.whois_raw_registery = whois_raw_registery;
    }

    @Override
    public String toString() {
        return "{" +
                "domain_name='" + domain_name + '\'' +
                ", query_time='" + query_time + '\'' +
                ", whois_server='" + whois_server + '\'' +
                ", domain_registered='" + domain_registered + '\'' +
                ", domain_registrar=" + domain_registrar +
                ", name_server=" + Arrays.toString(name_servers) +
                ", domain_status=" + Arrays.toString(domain_status) +
                ", whois_raw_registery='" + whois_raw_registery + '\'' +
                '}';
    }
}
