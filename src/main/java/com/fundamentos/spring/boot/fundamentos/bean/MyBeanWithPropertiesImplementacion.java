package com.fundamentos.spring.boot.fundamentos.bean;

public class MyBeanWithPropertiesImplementacion implements MyBeanWithProperties{

    private String nombre;
    private String apellido;
    private String random;

    public MyBeanWithPropertiesImplementacion(String nombre, String apellido, String random) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.random= random;
    }

    @Override
    public String function() {
        return nombre+" - "+apellido+" - "+random;
    }
}
