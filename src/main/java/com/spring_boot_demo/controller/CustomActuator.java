package com.spring_boot_demo.controller;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Configuration;

@Configuration
@Endpoint(id = "charu")
public class CustomActuator {
    @ReadOperation
    public void print(){
        System.out.println("Charu's World");

    }
}
