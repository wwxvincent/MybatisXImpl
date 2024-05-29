package com.vincent.mybatixtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ="com.vincent.mybatixtest.mapper")
public class MybatixtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatixtestApplication.class, args);
    }

}
