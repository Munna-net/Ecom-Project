package com.ecom.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1")
public class WelcomeController {

    @GetMapping("/welcome1")
    public String welcome() {
        return "Welcome to the Ecom Spring Boot application!";
    }
}
