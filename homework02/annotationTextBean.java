package com.geek.week05.homework02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// 显示的生命单个bean，都可以使用@Autowired或者@Resource注解注入；
@Configuration
public class annotationTextBean {
    @Bean(value = "textBean")
    void annotionBean(){
        System.out.println("这是注解注入bean");
    }
}
