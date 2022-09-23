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
public class media1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Double nota1,nota2,media;
        
        nota1 = leitor.nextDouble();
        nota2 = leitor.nextDouble();
        
        media = (nota1*3.5 + nota2*7.5)/11;
        
        System.out.println(String.format("MEDIA = %.1f",media));
    }
    
}
