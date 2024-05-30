//package com.vincent.mybatixtest.config;
//
//import org.mybatis.spring.mapper.MapperScannerConfigurer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Author: Vincent(Wenxuan) Wang
// * @Date: 5/29/24
// * @Description:
// */
//@Configuration
//public class MyBatisConfig {
//    // 使用 MapperScannerConfigurer 替代 @MapperScan
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
////        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory"); // 如果你有自定义的SqlSessionFactory名称，需要指定
//        mapperScannerConfigurer.setBasePackage("com.vincent.mybatixtest.mapper"); // 设置Mapper接口所在的包
//        return mapperScannerConfigurer;
//    }
//}
