package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;

import java.util.Date;
import java.util.List;

public interface Repository {

    void save (Persona persona, String marca, Date fecha);
    List<String> get();

}
