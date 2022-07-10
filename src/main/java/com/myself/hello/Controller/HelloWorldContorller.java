package com.myself.hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldContorller {

    @GetMapping
    public String helloworld(){
        System.out.println(
                "helloworld。"
        );
        return "OK";
    }
}
