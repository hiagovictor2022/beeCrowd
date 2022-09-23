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
public class gastoCombustivel {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer tempoGasto,velocidadeMedia,distancia;
        
        Double qtdeLitros;
        
        tempoGasto = leitor.nextInt();
        
        velocidadeMedia = leitor.nextInt();
        
        distancia = tempoGasto*velocidadeMedia;
        
        
        qtdeLitros = distancia /12.0;
        
        System.out.println(String.format("%.3f",qtdeLitros));
        
    }
}
