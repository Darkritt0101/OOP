package com.ucreativa.vacunacion.entities;

public class Familiar extends Persona{

    private String nombre;
    private String cedula;
    private int edad;
    private boolean riesgo;
    private String parentesco;

    public Familiar(String nombre, String cedula, int edad, boolean riesgo) {
        super(nombre, cedula, edad, riesgo);
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

    public String getParentesco() {
        return parentesco;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRiesgo(boolean riesgo) {
        this.riesgo = riesgo;
    }

}
