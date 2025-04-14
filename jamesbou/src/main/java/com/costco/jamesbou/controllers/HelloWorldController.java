package com.costco.jamesbou.controllers;

import com.costco.jamesbou.services.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/hello")
    public String hello() {
        return helloWorldService.getHelloMessage();
    }
}
