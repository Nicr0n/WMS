package com.nicron.study.wmsapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.nicron.study.wmsapi.dao")

public class WmsApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(WmsApiApplication.class, args);
    }

}
