/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia2estructuras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa en el cual se ingrese un valor límite positivo, y a
        //continuación solicite números al usuario hasta que la suma de los
        //números introducidos supere el límite inicial.
        
        int num, ingresa,suma;
        suma= 0;
        Scanner joa = new Scanner(System.in);
        
        System.out.println("Ingrese un num");
        num=joa.nextInt();
        
        do {
            System.out.println(" " + num);
            System.out.println("Ingresa numeros");
            ingresa=joa.nextInt();
            suma= suma + ingresa;
            
        
            
        }while (suma <= num);
           
        System.out.println("El total de la suma fue: " + suma);
    
}
}