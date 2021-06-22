package com.ucreativa.vacunacion.services;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;

import java.util.Date;
import java.util.List;

public class BitacoraService {

    private ContadorRiesgo contador;

    private Repository repository;

    public BitacoraService(Repository repository){
        this.repository = repository;
        this.contador= ContadorRiesgo.getInstance();
    }

    public void save(String nombre, String cedula, String txtEdad,
                     boolean riesgo, boolean isAmigo, String relacion,
                     String facebook, String parentesco, String marca){

        int edad=0;

        try {
            edad = Integer.parseInt(txtEdad);
        } catch (NumberFormatException e){
            e.printStackTrace();
        }

        Persona persona;
        if(isAmigo){
            persona = new Amigo(nombre, cedula, edad, riesgo, relacion, facebook);
        }else {
            persona = new Familiar(nombre, cedula, edad, riesgo, parentesco);
        }

        if (riesgo){
            this.contador.SumarRiesgo();
        }

        this.repository.save(persona, marca, new Date());

    }

    public List<String> get (){
        System.out.println("La cantidad de personas con riesgo es: " + this.contador.getCantidadRiesgo() );
        return this.repository.get();
    }
}
