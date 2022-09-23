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
public class conversaoDeTempo {
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         
         Integer entrada,segundos,minutos,horas,conversao;
         
         entrada = leitor.nextInt();
         
         conversao = entrada;
         
         horas = conversao/3600;
         conversao %= 3600;
         
         minutos = conversao/60;
         conversao %= 60;
         
         segundos = conversao/1;
         conversao %= 1;
         
         System.out.println(String.format("%d:%d:%d",horas,minutos,segundos));
         
    }
}
