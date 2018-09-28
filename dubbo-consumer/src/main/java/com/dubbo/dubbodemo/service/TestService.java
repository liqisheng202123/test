package com.dubbo.dubbodemo.service;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Component;

@Component
public class TestService {

    @Reference
    private AuthorService auhtorService;

    public String sayHello(String name){
        return auhtorService.test(name);
    }
}
