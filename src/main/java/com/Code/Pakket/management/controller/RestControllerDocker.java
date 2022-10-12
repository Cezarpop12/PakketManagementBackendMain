package com.Code.Pakket.management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDocker {
    @GetMapping("/voorbeeld")
    public String voorbeeld(){
        return "Docker voorbeeld back-end";
    }
}
