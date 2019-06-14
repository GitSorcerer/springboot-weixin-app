package com.weixin.demo.config.dao;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class SessionFactoryConfiguration {
    @Value("${mybatis_config_file}")
    private String mybatisConfigFilePath;

    /**
     * mapper文件的路径
     */
    @Value("${mapper_path}")
    private String mapperPath;

    @Autowired
    @Qualifier(value = "dataSource")
    private DataSource dataSource;

    /**
     * 实体
     */
    @Value("${entity_package}")
    private String entityPackage;

    /**
     * 扫描的dao
     */
    @Value("${mybatis_basePackage}")
    private String mybatisBasePackage;

    @Bean("sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setConfigLocation(new ClassPathResource(mybatisConfigFilePath));
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String packageSearchPath=PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperPath;
        //配置xml文件的路径
        sessionFactoryBean.setMapperLocations(resolver.getResources(packageSearchPath));
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setTypeAliasesPackage(entityPackage);
        return sessionFactoryBean;
    }


}
