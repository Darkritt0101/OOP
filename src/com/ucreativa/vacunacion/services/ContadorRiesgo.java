package com.ucreativa.vacunacion.services;

public class ContadorRiesgo {

    private int cantidadRiesgo;
    private static ContadorRiesgo instancia;

    //este metodo se devuelve a el mismo
    public static ContadorRiesgo getInstance(){
        if (instancia== null){
            instancia = new ContadorRiesgo();
        }
        return  instancia;

    }

    public void SumarRiesgo(){
        this.cantidadRiesgo++;
    }

    public int getCantidadRiesgo() {
        return cantidadRiesgo;
    }
}
