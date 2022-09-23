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
public class oMaior {
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         Integer a,b,c,maiorAB,maiorC;
         
         a = leitor.nextInt();
         b = leitor.nextInt();
         c = leitor.nextInt();
         
         maiorAB = (a+b+Math.abs(a-b))/2;
         maiorC =(maiorAB+c+Math.abs(maiorAB-c))/2;
         
         System.out.println(maiorC+" eh o maior");
    }
    
}
