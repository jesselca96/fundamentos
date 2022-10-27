package com.fundamentos.spring.boot.fundamentos.configuration;

import com.fundamentos.spring.boot.fundamentos.bean.MyBean;
import com.fundamentos.spring.boot.fundamentos.bean.MyBean2Implement;
import com.fundamentos.spring.boot.fundamentos.bean.MyBeanImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implement();
    }
}
