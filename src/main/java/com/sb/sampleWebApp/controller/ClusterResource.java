package com.sb.sampleWebApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClusterResource {

    @GetMapping("/hello")
    public String hello(){
        return "you are hitting endpoint";
    }
}
