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
public class media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Double n1,n2,n3,media;
        
        
        n1 = leitor.nextDouble();
        n2 = leitor.nextDouble();
        n3 = leitor.nextDouble();
        
        media = (n1*2+n2*3+n3*5)/10;
        
        System.out.println(String.format("MEDIA = %.1f",media));
        
    }
}
