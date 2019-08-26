package com.jiliwangluo.spider.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jiliwangluo.spider.api.dao")
public class SpiderApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiderApiApplication.class, args);
    }

}
