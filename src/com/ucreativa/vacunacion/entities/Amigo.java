package com.ucreativa.vacunacion.entities;

public class Amigo extends Persona {

    private String nombre;
    private String cedula;
    private int edad;
    private boolean riesgo;
    private String relacion;
    private String facebbok;

    public Amigo(String nombre, String cedula, int edad, boolean riesgo) {
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

    public String getRelacion() {
        return relacion;
    }

    public String getFacebbok() {
        return facebbok;
    }

    public void setEdad(int edad) {
        this.edad = edad + 1;
    }

    public void setRiesgo(boolean riesgo) {
        this.riesgo = riesgo;
    }
}
