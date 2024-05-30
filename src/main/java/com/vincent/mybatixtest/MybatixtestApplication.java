package com.vincent.mybatixtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@EnableSwagger2WebMvc
@MapperScan(basePackages ="com.vincent.mybatixtest.mapper")
public class MybatixtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatixtestApplication.class, args);
    }

}
