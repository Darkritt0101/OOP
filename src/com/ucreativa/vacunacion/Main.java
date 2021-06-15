package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraService;
import com.ucreativa.vacunacion.ui.FrontEnd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FrontEnd fe = new FrontEnd("Sistema de vacunacion");
        fe.build();
    } //Metodo main
}// clase
