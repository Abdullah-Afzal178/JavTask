package com.springboottask2.model;

public class CurrencyFreaks {
    private String currencyCode;
    private String currencyName;
    private String icon;
    private String status;
    private String available_in_historical_data_from;
    private String available_in_historical_data_till;
    private String countryCode;
    private String countryName;

    public CurrencyFreaks(String currencyCode, String currencyName, String icon, String status, String available_in_historical_data_from, String available_in_historical_data_till, String countryCode, String countryName) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.icon = icon;
        this.status = status;
        this.available_in_historical_data_from = available_in_historical_data_from;
        this.available_in_historical_data_till = available_in_historical_data_till;
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    public CurrencyFreaks() {
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAvailable_in_historical_data_from() {
        return available_in_historical_data_from;
    }

    public void setAvailable_in_historical_data_from(String available_in_historical_data_from) {
        this.available_in_historical_data_from = available_in_historical_data_from;
    }

    public String getAvailable_in_historical_data_till() {
        return available_in_historical_data_till;
    }

    public void setAvailable_in_historical_data_till(String available_in_historical_data_till) {
        this.available_in_historical_data_till = available_in_historical_data_till;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "CurrencyFreaks{" +
                "currencyCode='" + currencyCode + '\'' +
                ", currencyName='" + currencyName + '\'' +
                ", icon='" + icon + '\'' +
                ", status='" + status + '\'' +
                ", available_in_historical_data_from='" + available_in_historical_data_from + '\'' +
                ", available_in_historical_data_till='" + available_in_historical_data_till + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
