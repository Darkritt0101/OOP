package com.ucreativa.vacunacion.entities;

public class Amigo extends Persona {

    private String relacion;
    private String facebbok;

    public Amigo(String nombre, String cedula, int edad, boolean riesgo, String relacion, String facebbok) {
        super(nombre, cedula, edad, riesgo);
        this.relacion = relacion;
        this.facebbok = facebbok;
    }

    public String getRelacion() {
        return relacion;
    }

    public String getFacebbok() {
        return facebbok;
    }
}
