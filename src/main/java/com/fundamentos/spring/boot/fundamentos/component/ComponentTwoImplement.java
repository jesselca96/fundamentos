package com.fundamentos.spring.boot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependecy{

    @Override
    public void saludar() {
        System.out.println("Hola mundo desde mi segundo componente");
    }
}
