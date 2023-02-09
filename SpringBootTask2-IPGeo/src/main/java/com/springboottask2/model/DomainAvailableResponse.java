package com.springboottask2.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class DomainAvailableResponse {
    @NotNull(message = "is required")
    @Pattern(regexp = "^[a-zA-Z0-9][a-zA-Z0-9-]{1,61}[a-zA-Z0-9]\\.[a-zA-Z]{2,}$",message = "Enter a valid Domain Name")
    private String domain;
    private boolean domainAvailability;

    public DomainAvailableResponse(String domain, boolean domainAvailability) {
        this.domain = domain;
        this.domainAvailability = domainAvailability;
    }

    public DomainAvailableResponse() {
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public boolean isDomainAvailability() {
        return domainAvailability;
    }

    public void setDomainAvailability(boolean domainAvailability) {
        this.domainAvailability = domainAvailability;
    }

    @Override
    public String toString() {
        return "DomainAvailableResponse{" +
                "domain='" + domain + '\'' +
                ", domainAvailability=" + domainAvailability +
                '}';
    }
}
