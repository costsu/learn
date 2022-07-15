package com.myself.hello.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldContorller {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping
    public String helloworld(){
        redisTemplate.opsForValue().set("k1","v1");
        String v1 = (String) redisTemplate.opsForValue().get("k1");
        System.out.println(v1);

        return "OK";
    }
}
