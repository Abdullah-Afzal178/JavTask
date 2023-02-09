package com.springboottask2.model;

public class Query {
    private String given_amount;
    private String from;
    private String to;

    public Query(String given_amount, String from, String to) {
        this.given_amount = given_amount;
        this.from = from;
        this.to = to;
    }

    public Query() {
    }

    public String getGiven_amount() {
        return given_amount;
    }

    public void setGiven_amount(String given_amount) {
        this.given_amount = given_amount;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Query{" +
                "given_amount=" + given_amount +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
