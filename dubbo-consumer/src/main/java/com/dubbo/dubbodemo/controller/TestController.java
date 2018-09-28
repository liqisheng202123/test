package com.dubbo.dubbodemo.controller;

import com.dubbo.dubbodemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping("/say")
    public String sayHello(){
        return testService.sayHello("LQS");
    }
}
