package com.springboottask2.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class IpGeoLocation {
    @NotNull(message = "is Required")
    @Pattern(regexp = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$",message = "enter a valid IP Address")
    private String ip;
    private String continent_code;
    private String continent_name;
    private String country_code2;
    private String country_code3;
    private String country_name;
    private String country_flag;
    private String country_capital;
    private String state_prov;
    private String district;
    private String city;
    private String zipcode;
    private String latitude;
    private String longitude;
    private boolean is_eu;
    private String calling_code;
    private String country_tld;
    private String languages;
    private String geoname_id;
    private String isp;
    private String connection_type;
    private String organization;

    private Currency currency;
    private TimeZone time_zone;

    public IpGeoLocation() {
    }

    public IpGeoLocation(String ip, String continent_code, String continent_name, String country_code2, String country_code3,
                         String country_name, String country_capital, String state_prov, String district, String city, String zipcode,
                         String latitude, String longitude, boolean is_eu, String calling_code, String country_tld, String languages, String geoname_id,
                         String isp, String connection_type, String organization, Currency currency, TimeZone time_zone, String country_flag) {
        this.ip = ip;
        this.continent_code = continent_code;
        this.continent_name = continent_name;
        this.country_code2 = country_code2;
        this.country_code3 = country_code3;
        this.country_name = country_name;
        this.country_capital = country_capital;
        this.state_prov = state_prov;
        this.district = district;
        this.city = city;
        this.zipcode = zipcode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.is_eu = is_eu;
        this.calling_code = calling_code;
        this.country_tld = country_tld;
        this.languages = languages;
        this.geoname_id = geoname_id;
        this.isp = isp;
        this.connection_type = connection_type;
        this.organization = organization;
        this.currency = currency;
        this.time_zone = time_zone;
        this.country_flag=country_flag;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getContinent_code() {
        return continent_code;
    }

    public void setContinent_code(String continent_code) {
        this.continent_code = continent_code;
    }

    public String getContinent_name() {
        return continent_name;
    }

    public void setContinent_name(String continent_name) {
        this.continent_name = continent_name;
    }

    public String getCountry_code2() {
        return country_code2;
    }

    public void setCountry_code2(String country_code2) {
        this.country_code2 = country_code2;
    }

    public String getCountry_code3() {
        return country_code3;
    }

    public void setCountry_code3(String country_code3) {
        this.country_code3 = country_code3;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_capital() {
        return country_capital;
    }

    public void setCountry_capital(String country_capital) {
        this.country_capital = country_capital;
    }

    public String getState_prov() {
        return state_prov;
    }

    public void setState_prov(String state_prov) {
        this.state_prov = state_prov;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public boolean isIs_eu() {
        return is_eu;
    }

    public void setIs_eu(boolean is_eu) {
        this.is_eu = is_eu;
    }

    public String getCalling_code() {
        return calling_code;
    }

    public void setCalling_code(String calling_code) {
        this.calling_code = calling_code;
    }

    public String getCountry_tld() {
        return country_tld;
    }

    public void setCountry_tld(String country_tld) {
        this.country_tld = country_tld;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getGeoname_id() {
        return geoname_id;
    }

    public void setGeoname_id(String geoname_id) {
        this.geoname_id = geoname_id;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getConnection_type() {
        return connection_type;
    }

    public void setConnection_type(String connection_type) {
        this.connection_type = connection_type;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public TimeZone getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(TimeZone time_zone) {
        this.time_zone = time_zone;
    }

    public String getCountry_flag() {
        return country_flag;
    }

    public void setCountry_flag(String country_flag) {
        this.country_flag = country_flag;
    }

    @Override
    public String toString() {
        return "{" +
                "ip" + ":" + ip + '\n' +
                " continent_code" + ':' + continent_code + '\n' +
                " continent_name" + ':' + continent_name + '\n' +
                " country_code2" + ':' + country_code2 + '\n' +
                " country_code3" + ':' + country_code3 + '\n' +
                " country_name" + ':' + country_name + '\n' +
                " country_flag" + ':' + country_flag + '\n' +
                " country_capital" + ':' + country_capital + '\n' +
                " state_prov" + ':' + state_prov + '\n' +
                " district" + ':' + district + '\n' +
                " city" + ':' + city + '\n' +
                " zipcode" + ':' + zipcode + '\n' +
                " latitude" + ':' + latitude + '\n' +
                " longitude" + ':' + longitude + '\n' +
                " is_eu=" + is_eu +
                " calling_code" + ':' + calling_code + '\n' +
                " country_tld" + ':' + country_tld + '\n' +
                " languages" + ':' + languages + '\n' +
                " geoname_id" + ':' + geoname_id + '\n' +
                " isp" + ':' + isp + '\n' +
                " connection_type" + ':' + connection_type + '\n' +
                " organization" + ':' + organization + '\n' +
                " currency:" + currency +'\n' +
                " time_zone:" + time_zone +'\n' +
                '}';
    }
}