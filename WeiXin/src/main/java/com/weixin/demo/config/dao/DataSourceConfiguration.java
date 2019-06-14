package com.weixin.demo.config.dao;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;


@Configuration
@MapperScan("com.weixin.demo.dao")//扫描mapper
public class DataSourceConfiguration {

    @Value("${jdbc.username}")
    private String jdbcUser;
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.password}")
    private String jdbcPassword;


    @Bean(name = "dataSource")
    public DruidDataSource createDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(jdbcUrl);
        dataSource.setDriverClassName(jdbcDriver);
        dataSource.setUsername(jdbcUser);
        dataSource.setPassword(jdbcPassword);
        return dataSource;
    }
}
