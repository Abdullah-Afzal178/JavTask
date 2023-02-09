package com.springboottask2.model;

import java.util.Arrays;

public class DomainAvailableSuggestions {
    DomainAvailableResponse[] domain_available_response;

    public DomainAvailableSuggestions(DomainAvailableResponse[] domain_available_response) {
        this.domain_available_response = domain_available_response;
    }

    public DomainAvailableSuggestions() {
    }

    public DomainAvailableResponse[] getDomain_available_response() {
        return domain_available_response;
    }

    public void setDomain_available_response(DomainAvailableResponse[] domain_available_response) {
        this.domain_available_response = domain_available_response;
    }

    @Override
    public String toString() {
        return "DomainAvailableSuggestions{" +
                "domain_available_response=" + Arrays.toString(domain_available_response) +
                '}';
    }
}
