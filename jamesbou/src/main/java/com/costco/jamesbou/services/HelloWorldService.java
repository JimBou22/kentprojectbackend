package com.costco.jamesbou.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String getHelloMessage() {
        return "Hello, World!";
    }
}