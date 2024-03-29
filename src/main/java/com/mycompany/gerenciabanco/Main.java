/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;


/**
 *
 * @author melissa
 */
public class Main {
    public static void main(String[] args) {        
        UserInput userInput = new UserInput();
        
        String name = userInput.getUserInput("Informe seu nome");
        String surname = userInput.getUserInput("Informe seu sobrenome");
        String cpf = userInput.getUserInput("Informe seu cpf");

        Person person = new Person(name, surname, cpf);
        BankAccount bankAccount = new BankAccount(person);
        
        Menu menu = new Menu(bankAccount);
        int userEntry;
        
        do {
            menu.showOptions();
            userEntry = menu.getUserOption();
            menu.executeOption(userEntry);
        } while(userEntry != Menu.FLAG);
    }
}
