package com.patronbuilder;

public class Usuario {

    private String email;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;

    private Usuario(){
    }

    Usuario (UsuarioBuilder builder){
        this.email = builder.getEmail();
        this.nombre = builder.getNombre();
        this.apellidos = builder.getApellidos();
        this.telefono = builder.getTelefono();
        this.direccion = builder.getDireccion();
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
}
