package com.example.dubboserver.service.impl;

import com.example.dubboserver.service.TestService;

@
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String name) {
        return "Hello "+name+"!!";
    }
}
