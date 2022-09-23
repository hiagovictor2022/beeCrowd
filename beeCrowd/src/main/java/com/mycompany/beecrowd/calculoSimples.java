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
public class calculoSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer codigo1,codigo2,qtdPeca1,qtdPeca2;
        Double valor1,valor2,totalPagar;
        
        codigo1 = leitor.nextInt();
        qtdPeca1 = leitor.nextInt();
        valor1 = leitor.nextDouble();
        
        codigo2 = leitor.nextInt();
        qtdPeca2 = leitor.nextInt();
        valor2 = leitor.nextDouble();
        
        totalPagar = (qtdPeca1 * valor1)+(qtdPeca2*valor2);
       
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f",totalPagar));
        
    }
}
