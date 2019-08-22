package com.jikewangluo.zzweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @content:
 * @auther: 左飞
 * @date: 2019/8/22 16:31
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
