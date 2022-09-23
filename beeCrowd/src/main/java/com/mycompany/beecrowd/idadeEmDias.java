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
public class idadeEmDias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer entrada,atual,meses,dias,ano;
        
        
        entrada = leitor.nextInt();
        
        atual = entrada;
        
        ano = atual/365;
        atual %=365;
        
        meses = atual/30;
        atual %=30;
        
        dias = atual/1;
        atual %= 1;
        
        System.out.println(ano+" ano (s)");
        System.out.println(meses+" mes (es)");
        System.out.println(dias+" dia (s)");
        
    }
}
