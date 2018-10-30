package com.test.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * 配置tomcat启动参数
 * -Dspring.profiles.active="product"
 * @Profile("product")
 */
@Configuration
public class ProductDataSource {

    @Bean
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");;
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo" +
                "?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setInitialSize(5);
        dataSource.setMaxActive(10);
        return dataSource;
    }
}
