package com.springboottask2.services;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.springboottask2.model.Currency;
import com.springboottask2.model.IpGeoLocation;
import com.springboottask2.model.TimeZone;
import com.springboottask2.model.WhoIsFreaks;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
@Service
public class IpGeoService {
    GsonBuilder builder = new GsonBuilder().setPrettyPrinting();
    Gson gson = builder.create();

    public String code(String ipAddress){
        String api = "https://api.ipgeolocation.io/ipgeo?apiKey=b034e24a874d4a74ad548ae885fe49f8&ip=" + ipAddress;
        RestTemplate restTemplate = new RestTemplate();
        IpGeoLocation ipGeoLocation = restTemplate.getForObject(api, IpGeoLocation.class);
        String jsonResult = gson.toJson(ipGeoLocation);
        return jsonResult;
    }

    public LinkedHashMap<Object, Object> apiCall(String ipAddress) throws IllegalAccessException {
        String api = "https://api.ipgeolocation.io/ipgeo?apiKey=b034e24a874d4a74ad548ae885fe49f8&ip=" + ipAddress;
        RestTemplate restTemplate = new RestTemplate();
        IpGeoLocation apiResult = restTemplate.getForObject(api, IpGeoLocation.class);
        LinkedHashMap<Object, Object> apiResultMap = new LinkedHashMap<>();
        for (Field field : apiResult.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.getType().getSimpleName().equals("String") || field.getType().getSimpleName().equals("boolean")) {
                apiResultMap.put(field.getName(), field.get(apiResult));
            }
            if (field.getType().getSimpleName().equals("Currency")) {
                Currency currency = apiResult.getCurrency();
                for (Field field1 : currency.getClass().getDeclaredFields()) {
                    field1.setAccessible(true);
                    apiResultMap.put(field.getName() + " " + field1.getName(), field1.get(currency));
                }
            }
            if (field.getType().getSimpleName().equals("TimeZone")) {
                TimeZone timeZone = apiResult.getTime_zone();
                for (Field field2 : timeZone.getClass().getDeclaredFields()) {
                    field2.setAccessible(true);
                    if (field2.getName().equals("name")) {
                        apiResultMap.put(field.getName() + " " + field2.getName(), field2.get(timeZone));
                    } else {
                        apiResultMap.put(field2.getName(), field2.get(timeZone));
                    }
                }
            }
        }
        return apiResultMap;

    }
}
