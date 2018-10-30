package com.test.config;

import com.test.imp.CustomEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     *Spring Securoty练习，
     */
    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //配置user-detail服务,基于内存的用户存储认证 authentication
        /*auth.inMemoryAuthentication()
                .withUser("haoruirui").password("123456").roles("USER").and()
                .withUser("wahaha").password("123456").roles("USER", "ADMIN");*/

        //基于数据库表的认证
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("SELECT username, PASSWORD, enabled " +
                        "FROM USER where username = ?")
                .authoritiesByUsernameQuery("SELECT username, ROLE_USER" +
                        " FROM USER WHERE username = ?")
                .passwordEncoder(new CustomEncoder());
    }


}
