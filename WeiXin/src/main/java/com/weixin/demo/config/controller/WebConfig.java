package com.weixin.demo.config.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: GH
 * @Date: 2019/4/11 17:42
 * @Version 1.0
 * 跨域解决方案
 * Access-Control-Allow-Origin
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        /*registry.addMapping("/demo/**").allowedOrigins("http://domain2.com")
                .allowedMethods("PUT", "DELETE")
                .allowedHeaders("header1", "header2", "header3")
                .exposedHeaders("header1", "header2")
                .allowCredentials(false).maxAge(3600);*/
//        registry.addMapping("/**");
    }
}
