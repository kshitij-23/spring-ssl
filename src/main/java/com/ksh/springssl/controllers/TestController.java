package com.ksh.springssl.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ssl")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "SSL test successful...";
    }

}
