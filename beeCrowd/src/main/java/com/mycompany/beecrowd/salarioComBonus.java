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
public class salarioComBonus {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        
        Double salarioFixo,totalVendas,bonus,salarioTotal;
        
        nome = leitor.next();
        
        salarioFixo = leitor.nextDouble();
        totalVendas = leitor.nextDouble();
        
        bonus = totalVendas * 0.15;
        salarioTotal = salarioFixo + bonus;
        
        System.out.println(String.format("TOTAL = %.2f",salarioTotal));
        
    }
    
}
