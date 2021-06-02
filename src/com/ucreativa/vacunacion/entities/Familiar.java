package com.ucreativa.vacunacion.entities;

public class Familiar {

    private String nombre;
    private String cedula;
    private int edad;
    private boolean riesgo;


    public Familiar(String nombre, String cedula, int edad, boolean riesgo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.riesgo = riesgo;
    }


}
