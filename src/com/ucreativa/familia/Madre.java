package com.ucreativa.familia;

public class Madre {

    private String nombre;
    private int age;
    private String hobby;

    public Madre(String nombre, int age, String hobby){
        this.nombre = nombre;
        this.age = age;
        this.hobby = hobby;
    }

    public void setAge(){
        this.age = this.age +1;
    }

    public int getAge(){
        return this.age;
    }

}
