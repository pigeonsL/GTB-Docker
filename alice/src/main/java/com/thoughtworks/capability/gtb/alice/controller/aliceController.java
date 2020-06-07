package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

public class aliceController {

    @Autowired
    private RestTemplate template;

    @GetMapping("/hello")
    public Object hello(){
        String s = template.getForObject("http://bob:8081/hello", String.class);
        return s;
    }
}
