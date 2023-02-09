package com.springboottask2.model;

public class ResellerContact {
    private String name;

    public ResellerContact(String name) {
        this.name = name;
    }

    public ResellerContact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }
}
