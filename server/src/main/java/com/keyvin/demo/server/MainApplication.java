package com.keyvin.demo.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author weiwh
 * @date 2019/10/13 12:13
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.keyvin.demo"})
@MapperScan("com.keyvin.demo.model.dao")
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
