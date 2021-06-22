package com.patronbuilder;

public class Main {

    public static void main(String[] args){
        Usuario usuario = new UsuarioBuilder()
                .email("hola")
                .nombre("","")
                .telefono("")
                .direccion("")
                .build();


        System.out.println(usuario.getEmail());
    }




}
