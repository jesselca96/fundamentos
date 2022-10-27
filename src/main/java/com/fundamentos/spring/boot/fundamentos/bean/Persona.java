package com.fundamentos.spring.boot.fundamentos.bean;

public class Persona implements PersonaMethods {
    private int edad=26;
    private String nombre="Jessel";

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void saludar() {
        System.out.println("Hola "+getNombre()+" tienes "+getEdad()+" años cumplidos.");
    }
}
