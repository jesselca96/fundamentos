package com.fundamentos.spring.boot.fundamentos.configuration;

import com.fundamentos.spring.boot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.spring.boot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.spring.boot.fundamentos.bean.MyBeanWithPropertiesImplementacion;
import com.fundamentos.spring.boot.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;

    @Value("${value.apellido}")
    private String apellido;

    @Value("${value.random}")
    private String random;

    @Bean
    public MyBeanWithProperties function(){
        return new MyBeanWithPropertiesImplementacion(name,apellido,random);
    }
}
