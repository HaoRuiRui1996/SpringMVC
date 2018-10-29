package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
<<<<<<< HEAD
=======
import org.springframework.web.servlet.view.JstlView;
>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.test.controller"})
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
<<<<<<< HEAD
=======
        //处理格式化信息
        resolver.setViewClass(JstlView.class);
>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
