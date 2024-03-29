/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

import java.util.Scanner;

/**
 *
 * @author veris
 */
public class UserInput {
    Scanner scanner;
    
    public UserInput() {
        this.scanner = new Scanner(System.in);
    }
    
    public String getUserInput(String message) {
        System.out.print(message + ": ");
        
        return this.scanner.nextLine();
    }
}
