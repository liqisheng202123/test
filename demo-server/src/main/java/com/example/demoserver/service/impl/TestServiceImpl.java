package com.example.demoserver.service.impl;

import com.example.demoserver.service.TestService;

public class TestServiceImpl implements TestService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
