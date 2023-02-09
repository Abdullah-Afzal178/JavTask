package com.springboottask2.controller;
import com.springboottask2.model.CurrencyFreaks;
import com.springboottask2.model.ConvertedAmount;
import com.springboottask2.model.Query;
import com.springboottask2.services.CurrencyFreaksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
@Controller
@RequestMapping("/currencyFreaks")
public class CurrencyFreaksController {

    CurrencyFreaksService currencyFreaksService;
    @Autowired

    public CurrencyFreaksController(CurrencyFreaksService currencyFreaksService) {
        this.currencyFreaksService = currencyFreaksService;
    }

    @GetMapping("/apicall")
    public String apiCall(Model theModel){
        CurrencyFreaks[] currencyFreaks=currencyFreaksService.getAllCurrencies();
        theModel.addAttribute("model",currencyFreaks);
        return "currencyFreaksRecord";
    }

    @GetMapping("convert")
    public String convert(Model theModel){
        Query query=new Query();
        theModel.addAttribute("convertModel",query);
        return "convert";
    }
    @GetMapping("convertedAmount")
    public String convertedAmount(@ModelAttribute("convertModel") Query query, Model theModel){
        String from= query.getFrom();
        String to=query.getTo();
        String amount= query.getGiven_amount();
        ConvertedAmount convertedAmount=currencyFreaksService.currencyConverter(from,to,amount);
        theModel.addAttribute("convertedAmount",convertedAmount);
        return "convertAmount";
    }
}

