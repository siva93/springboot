package com.example.hellospring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Azure Kubernetes!";
    }
    
	@GetMapping("/")
	String return1(){
		return "Hello World - Greetings from Azure Kubernetes!";
	}
}
