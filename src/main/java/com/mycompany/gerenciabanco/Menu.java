/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

/**
 *
 * @author veris
 */
public class Menu {
    public static int FLAG = 0;
    private String[] options = {"Sair", "Consultar Saldo", "Sacar", "Depositar"};
    private UserInput userInput;
    private BankAccount bankAccount;
    
    public Menu(BankAccount bankAccount) {
        this.userInput = new UserInput();
        this.bankAccount = bankAccount;
    }
    
    public void showOptions() {
        for(int iterator = 0; iterator < this.options.length; iterator++) {
            String option = options[iterator];
            
            System.out.println(iterator + " - " + option);
        }
    }
    
    public int getUserOption() {
        int userOption = 0;
        
        do {
            userOption = Integer.parseInt(this.userInput.getUserInput("Digite uma opcao valida"));            
        } while (userOption < 0 || userOption >= this.options.length);
        
        return userOption;
    }
    
    public void executeOption(int option) {
        switch (option) {
            case 0 -> System.out.println("Saindo...");
            case 1 -> System.out.println(this.bankAccount.checkBalance());
            case 2 -> {
                double moneyToWithdrawl = Double.parseDouble(this.userInput.getUserInput("Informe o dinheiro a ser retirado"));
                Boolean success = bankAccount.withdrawl(moneyToWithdrawl);
                
                if(success) {                    
                    System.out.println("Dinheiro sacado com sucesso");
                    
                    return;
                }
                
                System.out.println("Nao foi possivel sacar o dinheiro");
            }
            case 3 -> {
                double moneyToDeposit = Double.parseDouble(this.userInput.getUserInput("Informe o dinheiro a ser depositado"));
                bankAccount.deposit(moneyToDeposit);
                
                System.out.println("Dinheiro depositado com sucesso");
            }
        }
    }
}
