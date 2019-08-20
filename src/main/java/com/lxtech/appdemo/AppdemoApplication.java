package com.lxtech.appdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@ServletComponentScan
@MapperScan(value = "com.lxtech.appdemo.dao,com.lxtech.appdemo.controller.web,com.lxtech.appdemo.controller.api")
@SpringBootApplication
@EnableScheduling
public class AppdemoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AppdemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(AppdemoApplication.class, args);
    }

}
