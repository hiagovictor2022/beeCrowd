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
public class salario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer idFuncionario, horasTrabalhadas;
        Double valorHora,salario;
        
        idFuncionario = leitor.nextInt();
        
        horasTrabalhadas = leitor.nextInt();
        
        valorHora = leitor.nextDouble();
        
        salario = horasTrabalhadas * valorHora;
        
        System.out.println("NUMBER = "+idFuncionario);
        
        System.out.println(String.format("SALARY U$ %.2f",salario));
        
        
    }
    
}
