package com.springboottask2.controller;

import com.springboottask2.model.DomainAvailableResponse;
import com.springboottask2.model.WhoIsFreaks;
import com.springboottask2.services.WhoIsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("whoisfreaks")
public class WhoIsFreaksController {
    WhoIsService whoIsService;
    @Autowired
    public WhoIsFreaksController(WhoIsService whoIsService) {
        this.whoIsService = whoIsService;
    }
    @GetMapping("lookUp")
    public String lookUp(@Valid @ModelAttribute("whoIsLookupModel") WhoIsFreaks whoIsFreaks, BindingResult bindingResult, Model theModel) {
        if (bindingResult.hasErrors()) {
            return "whoIsLookupRecord";
        }
        String domainName = whoIsFreaks.getDomain_name();
        String jsonResult = whoIsService.lookUp(domainName);
        theModel.addAttribute("jsonResult", jsonResult);
        return "whoIsLookupRecord";
    }
    @GetMapping("/historical")
    public String historical(@Valid @ModelAttribute("whoIsHistoryModel") WhoIsFreaks whoIsFreaks, BindingResult bindingResult, Model theModel) {
        if (bindingResult.hasErrors()) {
            return "whoIsHistorical";
        }
        String domainName = whoIsFreaks.getDomain_name();
        String jsonResult = whoIsService.historical(domainName);
        theModel.addAttribute("jsonResult", jsonResult);
        return "whoIsHistorical";
    }

    @GetMapping("domainAvailability")
    public String domainAvalability(@Valid @ModelAttribute("whoIsDomainAvailability") DomainAvailableResponse domainAvailableResponse,BindingResult bindingResult, Model theModel) {
        if (bindingResult.hasErrors()) {
            return "whoIsDomainAvailability";
        }
        String domainName = domainAvailableResponse.getDomain();
        String jsonResult = whoIsService.domainAvailability(domainName);
        theModel.addAttribute("jsonResult", jsonResult);
        return "whoIsDomainAvailability";
    }

    @GetMapping("domainAvailabilitySuggestions")
    public String domainAvalabilitySuggestions(@Valid @ModelAttribute("domainAvailabilitySuggestions") DomainAvailableResponse domainAvailableSuggestions,BindingResult bindingResult, Model theModel) {
        if (bindingResult.hasErrors()) {
            return "WhoIsDomainAvailabilitySuggestions";
        }
        String domainName = domainAvailableSuggestions.getDomain();
        String jsonResult = whoIsService.domainAvailabilitySuggestions(domainName);
        theModel.addAttribute("jsonResult", jsonResult);
        return "WhoIsDomainAvailabilitySuggestions";
    }
}
