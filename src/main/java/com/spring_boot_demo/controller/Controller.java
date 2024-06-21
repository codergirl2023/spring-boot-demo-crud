package com.spring_boot_demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/hello")
    public void hello() {
        System.out.println("hello world at " + serverPort);
    }

}
