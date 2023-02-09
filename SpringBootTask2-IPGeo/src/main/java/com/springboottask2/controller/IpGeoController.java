package com.springboottask2.controller;

import com.springboottask2.model.IpGeoLocation;
import com.springboottask2.services.IpGeoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.LinkedHashMap;
@org.springframework.stereotype.Controller
@RequestMapping("/ipgeo")
public class IpGeoController {
    IpGeoService ipGeoService;
    @Autowired
    public IpGeoController(IpGeoService ipGeoService) {
        this.ipGeoService = ipGeoService;
    }
    @GetMapping("/apiCall")
    public String apiCall(@Valid @ModelAttribute("ipModel") IpGeoLocation ipGeo, BindingResult bindingResult, Model theModel) throws IllegalAccessException {
        if (bindingResult.hasErrors()) {
            return "ipGeoRecord";
        }
        String ipAddress = ipGeo.getIp();
        LinkedHashMap<Object, Object> apiResultMap = ipGeoService.apiCall(ipAddress);
        String jsonResult=ipGeoService.code(ipAddress);
        theModel.addAttribute("ipGeoRecord", apiResultMap);
        theModel.addAttribute("jsonResult",jsonResult);
        return "ipGeoRecord";
    }
}