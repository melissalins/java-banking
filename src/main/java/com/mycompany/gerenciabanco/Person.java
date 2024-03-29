/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

/**
 *
 * @author veris
 */
public class Person {
    private String name;
    private String surname;
    private String cpf;
    
    public Person(String name, String surname, String cpf) {
        this.name = name;
        this.surname = surname;
        this.cpf = cpf;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getSurname() {
        return this.surname;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    @Override
    public String toString() {
        return this.getName() + " " + this.getSurname() + ", " + this.getCpf();
    }
}
