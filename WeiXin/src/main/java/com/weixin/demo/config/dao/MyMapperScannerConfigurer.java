package com.weixin.demo.config.dao;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

/**
 * @Author: GH
 * @Date: 2019/4/9 22:47
 * @Version 1.0
 */
@Configuration
//@Import(SessionFactoryConfiguration.class)
@AutoConfigureAfter(SessionFactoryConfiguration.class)
public class MyMapperScannerConfigurer {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurerBean() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //实体
        mapperScannerConfigurer.setBasePackage("com.weixin.demo.dao");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        Properties properties = new Properties();
        //Tk Mapper的完整限定名
        properties.setProperty("mappers", "tk.mybatis.mapper.common.Mapper");
        properties.setProperty("notEmpty", "false");
        properties.setProperty("IDENTITY", "MYSQL");
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }
}
