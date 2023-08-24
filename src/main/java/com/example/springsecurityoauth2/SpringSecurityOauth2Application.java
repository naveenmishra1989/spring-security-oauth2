package com.example.springsecurityoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableOAuth2Sso
public class SpringSecurityOauth2Application {

    @GetMapping("/")
    public String getMessage(){
        return "hello";
    }

    public static void main (String[] args) {
        SpringApplication.run(SpringSecurityOauth2Application.class, args);
    }

}
