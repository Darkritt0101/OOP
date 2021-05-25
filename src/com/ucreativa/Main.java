package com.ucreativa;

import com.ucreativa.familia.Adolfo;
import com.ucreativa.familia.Madre;
import com.ucreativa.familia.Padre;

public class Main {

    public static void main(String[] args) {
	    Adolfo  estudiante = new Adolfo();
        Padre hector = new Padre("Padre: Hola Hector");
        Madre mercedes = new Madre();

        mercedes.setAge();
        System.out.println("Edad de madre: " + mercedes.getAge());


    }
}
