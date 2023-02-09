package com.springboottask2.services;

import com.springboottask2.model.ConvertedAmount;
import com.springboottask2.model.CurrencyFreaks;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyFreaksService {

   public ConvertedAmount currencyConverter(String from,String to,String amount){
       String api="https://api.currencyfreaks.com/latest/convert?apikey=bfc4938230a64b108ae14575dec73df9&from="+from+"&to="+to+"&amount="+amount;
       RestTemplate restTemplate=new RestTemplate();
       ConvertedAmount convertedAmount=restTemplate.getForObject(api, ConvertedAmount.class);
       return convertedAmount;
   }
   public CurrencyFreaks[] getAllCurrencies(){
       String api="https://api.currencyfreaks.com/supported-currencies";
       RestTemplate restTemplate=new RestTemplate();
       CurrencyFreaks[] apiResult=restTemplate.getForObject(api, CurrencyFreaks[].class);
       return apiResult;
   }
}
