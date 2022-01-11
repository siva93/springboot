package com.devops.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Greetings from Azure Kubernetes! Image created from jenkins and deployed using Octopus at 11-01-2022 11:55 AM";
    }
}
