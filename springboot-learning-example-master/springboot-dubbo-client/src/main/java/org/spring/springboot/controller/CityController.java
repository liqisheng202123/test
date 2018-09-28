package org.spring.springboot.controller;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.spring.springboot.dubbo.CityDubboConsumerService;
import org.spring.springboot.dubbo.CityDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    private CityDubboConsumerService cityDubboConsumerService;
    @RequestMapping("/say")
    public String sayHello(){
        return cityDubboConsumerService.printCity();
    }

    public static void main(String[] args) {
        int a = 1;
        while (true){
            if (a%2==1 && a%3==0&&a%4==1&&a%5==1&&a%6==3&&a%7==0&&a%8==1&&a%9==0){
                System.out.println("============="+a);
                break;
            }
            a++;
            System.out.println(a);
        }
    }

}
