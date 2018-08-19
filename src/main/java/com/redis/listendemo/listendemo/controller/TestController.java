package com.redis.listendemo.listendemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.soap.Addressing;

@RestController
@RequestMapping("/apis/")
public class TestController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @RequestMapping(value = "/sendRedisMsg", method = RequestMethod.GET)
    public String sendRedisMsg() {

        stringRedisTemplate.convertAndSend("chat",String.valueOf(Math.random()));
        return "success";
    }
}
