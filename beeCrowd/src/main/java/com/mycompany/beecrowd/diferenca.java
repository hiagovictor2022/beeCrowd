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
public class diferenca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer a, b, c, d;
        
        a = leitor.nextInt();
        b = leitor.nextInt();
        c = leitor.nextInt();
        d = leitor.nextInt();
        
        System.out.println("DIFERENCA = "+(a*b - c*d));
    }
    
}
