package com.springboottask2.model;

public class CurrentRates {
    private String USD;
    private String PKR;

    public CurrentRates(String USD, String PKR) {
        this.USD = USD;
        this.PKR = PKR;
    }

    public CurrentRates() {
    }

    public String getUSD() {
        return USD;
    }

    public void setUSD(String USD) {
        this.USD = USD;
    }

    public String getPKR() {
        return PKR;
    }

    public void setPKR(String PKR) {
        this.PKR = PKR;
    }

    @Override
    public String toString() {
        return "CurrentRates{" +
                "USD=" + USD +
                ", PKR=" + PKR +
                '}';
    }
}
