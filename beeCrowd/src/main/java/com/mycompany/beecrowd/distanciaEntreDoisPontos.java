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
public class distanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Double x1,y1,x2,y2,distancia;
        
        x1 = leitor.nextDouble();
        y1 = leitor.nextDouble();
        x2 = leitor.nextDouble();
        y2 = leitor.nextDouble();
        
        distancia = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        
        System.out.println(String.format("%.4f",distancia));
        
    }
    
}
