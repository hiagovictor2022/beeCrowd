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
public class areaCirculo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Double raio,area;
        
        raio = leitor.nextDouble();
        
        area = 3.14159*(raio*raio);
        
        System.out.println(String.format("A=%.4f",area));
                
    }
    
}
