
package com.springboottask2.model;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.util.Arrays;
public class WhoIsFreaks {
    private int num;
    private boolean status;

    @NotNull(message = "is required")
    @Pattern(regexp = "^[a-zA-Z0-9][a-zA-Z0-9-]{1,61}[a-zA-Z0-9]\\.[a-zA-Z]{2,}$",message = "Enter a valid Domain Name")

    private String domain_name;
    private String query_time;
    private String whois_server;
    private String domain_registered;
    private String create_date;
    private String update_date;
    private String expiry_date;
    private DomainRegistrar domain_registrar;
    private ResellerContact reseller_contact;
    private RegistrantContact registrant_contact;
    private AdministrativeContact administrative_contact;

    private TechnicalContact technical_contact;
    private String[] name_servers;
    private  String[] domain_status;
    private String whois_raw_domain;
    private RegistryData registry_data;

    public WhoIsFreaks(boolean status, int num,String domain_name, String query_time,String whois_server, String domain_registered, String create_date, String update_date, String expiry_date, DomainRegistrar domain_registrar, ResellerContact reseller_contact, RegistrantContact registrant_contact, AdministrativeContact administrative_contact, TechnicalContact technical_contact, String[] name_servers, String[] domain_status, String whois_raw_domain, RegistryData registry_data) {
        this.status = status;
        this.domain_name = domain_name;
        this.query_time=query_time;
        this.whois_server = whois_server;
        this.domain_registered = domain_registered;
        this.create_date = create_date;
        this.update_date = update_date;
        this.expiry_date = expiry_date;
        this.domain_registrar = domain_registrar;
        this.reseller_contact = reseller_contact;
        this.registrant_contact = registrant_contact;
        this.administrative_contact = administrative_contact;
        this.technical_contact = technical_contact;
        this.name_servers = name_servers;
        this.domain_status = domain_status;
        this.whois_raw_domain = whois_raw_domain;
        this.registry_data = registry_data;
        this.num=num;
    }

    public WhoIsFreaks() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public DomainRegistrar getDomain_registrar() {
        return domain_registrar;
    }

    public void setDomain_registrar(DomainRegistrar domain_registrar) {
        this.domain_registrar = domain_registrar;
    }

    public ResellerContact getReseller_contact() {
        return reseller_contact;
    }

    public void setReseller_contact(ResellerContact reseller_contact) {
        this.reseller_contact = reseller_contact;
    }

    public RegistrantContact getRegistrant_contact() {
        return registrant_contact;
    }

    public void setRegistrant_contact(RegistrantContact registrant_contact) {
        this.registrant_contact = registrant_contact;
    }

    public AdministrativeContact getAdministrative_contact() {
        return administrative_contact;
    }

    public void setAdministrative_contact(AdministrativeContact administrative_contact) {
        this.administrative_contact = administrative_contact;
    }

    public TechnicalContact getTechnical_contact() {
        return technical_contact;
    }

    public void setTechnical_contact(TechnicalContact technical_contact) {
        this.technical_contact = technical_contact;
    }

    public String[] getName_servers() {
        return name_servers;
    }

    public void setName_servers(String[] name_servers) {
        this.name_servers = name_servers;
    }

    public String[] getDomain_status() {
        return domain_status;
    }

    public void setDomain_status(String[] domain_status) {
        this.domain_status = domain_status;
    }

    public String getWhois_raw_domain() {
        return whois_raw_domain;
    }

    public void setWhois_raw_domain(String whois_raw_domain) {
        this.whois_raw_domain = whois_raw_domain;
    }

    public RegistryData getRegistry_data() {
        return registry_data;
    }

    public void setRegistry_data(RegistryData registry_data) {
        this.registry_data = registry_data;
    }

    @Override
    public String toString() {
        return "WhoIsFreaks{" +
                "num=" + num +
                ", status=" + status +
                ", domain_name='" + domain_name + '\'' +
                ", query_time='" + query_time + '\'' +
                ", whois_server='" + whois_server + '\'' +
                ", domain_registered='" + domain_registered + '\'' +
                ", create_date='" + create_date + '\'' +
                ", update_date='" + update_date + '\'' +
                ", expiry_date='" + expiry_date + '\'' +
                ", domain_registrar=" + domain_registrar +
                ", reseller_contact=" + reseller_contact +
                ", registrant_contact=" + registrant_contact +
                ", administrative_contact=" + administrative_contact +
                ", technical_contact=" + technical_contact +
                ", name_servers=" + Arrays.toString(name_servers) +
                ", domain_status=" + Arrays.toString(domain_status) +
                ", whois_raw_domain='" + whois_raw_domain + '\'' +
                ", registry_data=" + registry_data +
                '}';
    }
}

