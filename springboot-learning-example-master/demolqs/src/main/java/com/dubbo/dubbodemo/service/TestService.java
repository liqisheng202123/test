package com.dubbo.dubbodemo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class TestService {
    @Reference(version = "1.0.0")
    private AuthorService authorService;

    public String say(String name){
       return authorService.test(name);
    }
}
