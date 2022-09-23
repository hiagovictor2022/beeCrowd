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
public class area {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Double a,b,c,triangulo,circulo,trapezio,quadrado,retangulo;
        
        a = leitor.nextDouble();
        b = leitor.nextDouble();
        c = leitor.nextDouble();
        
        triangulo = (a*c)/2; 
        circulo = 3.14159*(c*c);
        trapezio = ((a+b)*c)/2;
        quadrado = b*b;
        retangulo = a*b;
        
        System.out.println(String.format("TRIANGULO: %.3f",triangulo));
        System.out.println(String.format("CIRCULO: %.3f",circulo));
        System.out.println(String.format("TRAPEZIO: %.3f",trapezio));
        System.out.println(String.format("QUADRADO: %.3f",quadrado));
        System.out.println(String.format("RETANGULO: %.3f",retangulo));
        
    }
    
}
