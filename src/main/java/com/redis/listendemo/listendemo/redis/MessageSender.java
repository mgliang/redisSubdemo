//package com.redis.listendemo.listendemo.redis;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@EnableScheduling //开启定时器功能
//@Component
//public class MessageSender {
//
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    @Scheduled(fixedRate = 2000) //间隔2s 通过StringRedisTemplate对象向redis消息队列chat频道发布消息
//    public void sendMessage(){
//        stringRedisTemplate.convertAndSend("chat",String.valueOf(Math.random()));
//    }
//}
