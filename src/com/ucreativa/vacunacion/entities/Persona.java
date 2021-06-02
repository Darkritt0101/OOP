package com.ucreativa.vacunacion.entities;

public class Persona {

    private String nombre;
    private String cedula;
    private int edad;
    private boolean riesgo;

    public Persona(String nombre, String cedula, int edad, boolean riesgo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.riesgo = riesgo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isRiesgo() {
        return riesgo;
    }

    public void setRiesgo(boolean riesgo) {
        this.riesgo = riesgo;
    }

    public void setEdad(int edad) {
        this.edad = edad + 1;
    }

}
