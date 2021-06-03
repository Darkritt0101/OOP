package com.ucreativa.vacunacion;


import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Familiar mama = new Familiar("Mercedes", "825631563", 57,
                                true,"Madre");

        Familiar hermano = new Familiar("Jorge", "25632632", 28,
                                true, "Hermano");

        Amigo compaTrabajo = new Amigo("Roberto", "4563256", 35,
                                    true, "CompaTrabajo","Ni idea");


        List<BitacoraVacunas> bitacora = new ArrayList<>();
        bitacora.add(new BitacoraVacunas(mama,"Pfizer",new Date()));
        bitacora.add(new BitacoraVacunas(hermano,"AstraZeneca",new Date()));
        bitacora.add(new BitacoraVacunas(compaTrabajo,"Johnson", new Date()));

        bitacora.forEach(System.out::println);


    }
}
