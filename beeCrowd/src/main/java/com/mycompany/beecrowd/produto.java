/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beecrowd;

import java.util.Scanner;

/**
 *
 * @author Hiago
 */
public class produto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer numero1,numero2;
        
        System.out.println("numero 1");
        numero1 = leitor.nextInt();
        
        System.out.println("numero 2");
        numero2 = leitor.nextInt();
        
 
        
        System.out.println("PROD = "+(numero1*numero2));
        
    }
    
}
