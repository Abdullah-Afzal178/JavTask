package com.springboottask2.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.springboottask2.model.DomainAvailableResponse;
import com.springboottask2.model.DomainAvailableSuggestions;
import com.springboottask2.model.WhoIsFreaks;
import com.springboottask2.model.WhoIsHistory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WhoIsService {
    GsonBuilder builder = new GsonBuilder().setPrettyPrinting();
    Gson gson = builder.create();

    public String lookUp(String domainName){
        String api="https://api.whoisfreaks.com/v1.0/whois?whois=live&domainName="+domainName+"&apiKey=d818ccaabd4e4af59779f6e89ede6d84";
        RestTemplate restTemplate = new RestTemplate();
        WhoIsFreaks apiResult = restTemplate.getForObject(api, WhoIsFreaks.class);
        String jsonResult = gson.toJson(apiResult);
        return jsonResult;
    }
    public String historical(String domainName){
        String api = "https://api.whoisfreaks.com/v1.0/whois?apiKey=d818ccaabd4e4af59779f6e89ede6d84&whois=historical&domainName=" + domainName;
        RestTemplate restTemplate = new RestTemplate();
        WhoIsHistory apiResult = restTemplate.getForObject(api, WhoIsHistory.class);
        String jsonResult = gson.toJson(apiResult);
        return jsonResult;

    }
    public String domainAvailability(String domainName){
        String api = "https://api.whoisfreaks.com/v1.0/domain/availability?apiKey=d818ccaabd4e4af59779f6e89ede6d84&domain=google.com"+domainName;
        RestTemplate restTemplate = new RestTemplate();
        DomainAvailableResponse apiResult = restTemplate.getForObject(api, DomainAvailableResponse.class);
        String jsonResult = gson.toJson(apiResult);
        return jsonResult;

    }
    public String domainAvailabilitySuggestions(String domainName){
        String api = "https://api.whoisfreaks.com/v1.0/domain/availability?apiKey=d818ccaabd4e4af59779f6e89ede6d84&domain="+domainName+"&sug=true";
        RestTemplate restTemplate = new RestTemplate();
        DomainAvailableSuggestions apiResult = restTemplate.getForObject(api, DomainAvailableSuggestions.class);
        String jsonResult = gson.toJson(apiResult);
        return jsonResult;

    }

}
