package com.springboottask2.model;

import java.util.Arrays;

public class WhoIsHistory {
    private boolean status;
    private String whois;
    private String total_records;
    private WhoIsFreaks[] whois_domains_historical;

    public WhoIsHistory(boolean status, String whois, String total_records, WhoIsFreaks[] whois_domains_historical) {
        this.status = status;
        this.whois = whois;
        this.total_records = total_records;
        this.whois_domains_historical = whois_domains_historical;
    }

    public WhoIsHistory() {
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getWhois() {
        return whois;
    }

    public void setWhois(String whois) {
        this.whois = whois;
    }

    public String getTotal_records() {
        return total_records;
    }

    public void setTotal_records(String total_records) {
        this.total_records = total_records;
    }

    public WhoIsFreaks[] getWhois_domains_historical() {
        return whois_domains_historical;
    }

    public void setWhois_domains_historical(WhoIsFreaks[] whois_domains_historical) {
        this.whois_domains_historical = whois_domains_historical;
    }

    @Override
    public String toString() {
        return "WhoIsHistory{" +
                "status=" + status +
                ", whois='" + whois + '\'' +
                ", total_records='" + total_records + '\'' +
                ", whois_domains_historical=" + Arrays.toString(whois_domains_historical) +
                '}';
    }
}
