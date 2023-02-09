package com.springboottask2.model;

public class ConvertedAmount {
    private String date;
    private CurrentRates currentRates;
    private String converted_amount;
    private Query query;

    public ConvertedAmount(String date, CurrentRates currentRates, String converted_amount, Query query) {
        this.date = date;
        this.currentRates = currentRates;
        this.converted_amount = converted_amount;
        this.query = query;
    }

    public ConvertedAmount() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CurrentRates getCurrentRates() {
        return currentRates;
    }

    public void setCurrentRates(CurrentRates currentRates) {
        this.currentRates = currentRates;
    }

    public String getConverted_amount() {
        return converted_amount;
    }

    public void setConverted_amount(String converted_amount) {
        this.converted_amount = converted_amount;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "Date{" +
                "date='" + date + '\'' +
                ", currentRates=" + currentRates +
                ", converted_amount=" + converted_amount +
                ", query=" + query +
                '}';
    }
}
