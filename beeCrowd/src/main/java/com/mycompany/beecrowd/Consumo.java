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
public class Consumo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer km;
        Double litroPorKm,consumo;
        
        km = leitor.nextInt();
        litroPorKm = leitor.nextDouble();
        
        consumo = km/litroPorKm;
        
        System.out.println(String.format("%.3f km/l",consumo));
    }
    
}
