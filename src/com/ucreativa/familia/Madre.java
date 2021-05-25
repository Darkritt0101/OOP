package com.ucreativa.familia;

public class Madre {

    private String nombre;
    private int age;
    private String hobby;

    public Madre(){
        this.nombre = "Mercedes";
        this.age = 55;
        this.hobby = "Cuidar Plantas";
    }

    public void setAge(){
        this.age = this.age +1;
    }

    public int getAge(){
        return this.age;
    }

}
