package com.ksh.springssl.controllers;

import com.ksh.springssl.models.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ssl")
public class TestController {

    @GetMapping("/test-get")
    public String test() {
        return "SSL test successful...";
    }

    @PostMapping("/test-post")
    public Person getPerson(@RequestBody Person person) {
        return person;
    }
}
