package com.spring.annotation.bean;

import org.springframework.stereotype.Controller;

@Controller("android")
public class Robot {
    public void walk(int feet, String direction) {
        System.out.println("Walking "+feet+" feet in "+direction+" direction");
    }
}
