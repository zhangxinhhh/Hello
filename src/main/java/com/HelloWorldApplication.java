package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class HelloWorldApplication {

    @ResponseBody
    @RequestMapping("/hello")
    public String Hello(){
        return "Hello World!";
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}
