package com.springboot.ovit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OvitApplication {

    public static void main(String[] args) {
        SpringApplication.run(OvitApplication.class, args);
    }

    @RequestMapping("/hi")
    public String hi(){
        return "hi spring boot";
    }

}
