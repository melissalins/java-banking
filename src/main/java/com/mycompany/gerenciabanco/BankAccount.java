/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

import java.text.DecimalFormat;

/**
 *
 * @author veris
 */
public class BankAccount {
    private final Person person;
    private Double balance;
    private DecimalFormat decimalFormat;
    
    public BankAccount(Person person) {
        this.person =  person;
        this.balance = 0D;
        this.decimalFormat = new DecimalFormat("#.##");
    }
    
    private String formatMoney(Double money) {
        return this.decimalFormat.format(money);
    }
    
    public Person getPerson() {
        return this.person;
    }
    
    public Boolean withdrawl(Double cash) {
        if(this.balance >= cash) {
            this.balance -= cash;
            System.out.println("R$" + this.formatMoney(cash) + " retirado da conta de " + person.toString());
            
            return true;
        }
        
        return false;
    }
    
    public void deposit(Double cash) {
        this.balance += cash;
        System.out.println("R$" + this.formatMoney(cash) + " depositado na conta de " + person.toString());
    }
    
    public Double getBalance() {
        return this.balance;
    }
    
    public String checkBalance() {
        return "Ha R$" + this.formatMoney(this.getBalance()) + " na conta de " + person.toString();
    }
}
