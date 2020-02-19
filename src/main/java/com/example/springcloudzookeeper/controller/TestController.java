package com.example.springcloudzookeeper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public Object test(){
        System.out.println("进入服务生产端");
        return"测试成功";
    }
}

