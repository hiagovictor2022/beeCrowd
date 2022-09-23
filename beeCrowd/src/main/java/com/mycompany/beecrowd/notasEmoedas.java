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
public class notasEmoedas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer atual,nota100,nota50,nota20,nota10,nota5,nota2,nota1,
                moeda50,moeda25,moeda10,moeda5,moeda01;
        
        Double valorEntrada;
        
          
        valorEntrada = leitor.nextDouble();
        
         
        atual =(int)Math.round(valorEntrada);
        
        nota100 = atual/100;
        atual %=100;
        
        nota50 = atual/50;
        atual %= 50;
        
        nota20 = atual/20;
        atual %= 20;
        
        nota10 = atual/10;
        atual %= 10;
        
        nota5 = atual/5;
        atual %= 5;
        
        nota2 = atual/2;
        atual %= 2;
        
        nota1 = atual/1;
        atual %= 1;
        
        
        moeda50 = atual/50;
        atual %= 50;
        
        moeda25 = atual/25;
        atual %=25;
        
        moeda10 = atual/10;
        atual %=10;
        
        moeda5 = atual/05;
        atual %= 5;
        
        moeda01 = atual/01;
        atual %=1;
        
  
        
        System.out.println("NOTAS:");
        System.out.println(String.format("%d nota(s) de R$ 100.00",nota100));
        System.out.println(String.format("%d nota(s) de R$ 50.00",nota50));
        System.out.println(String.format("%d nota(s) de R$ 20.00",nota20));
        System.out.println(String.format("%d nota(s) de R$ 10.00",nota10));
        System.out.println(String.format("%d nota(s) de R$ 5.00",nota5));
        System.out.println(String.format("%d nota(s) de R$ 2.00",nota2));
        
        System.out.println("MOEDAS:");
        System.out.println(String.format("%d moedas(s) de R$ 1.00",nota1));
        System.out.println(String.format("%d moedas(s) de R$ 0.50",moeda50));
        System.out.println(String.format("%d moedas(s) de R$ 0.25",moeda25));
        System.out.println(String.format("%d moedas(s) de R$ 0.10",moeda10));
        System.out.println(String.format("%d moedas(s) de R$ 0.05",moeda5));
        System.out.println(String.format("%d moedas(s) de R$ 0.01",moeda01));
                            
    }
    
}
