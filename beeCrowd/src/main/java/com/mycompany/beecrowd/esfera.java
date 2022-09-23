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
public class esfera {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    
    Double volume,raio;
    
    raio = leitor.nextDouble();
    
    volume = (4.0/3.0) * 3.14159 * raio * raio * raio;
    
        System.out.println(String.format("VOLUME = %.3f",volume));
        
    }
    
    
    
   
}
