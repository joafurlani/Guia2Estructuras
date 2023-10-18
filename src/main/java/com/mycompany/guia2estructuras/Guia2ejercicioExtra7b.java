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
public class Guia2ejercicioExtra7b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingresa la cantidad de numeros");
        int n=leer.nextInt();
        int maximo=0, minimo=0, contador=0;
        double promedio =0;
        
        do{
            System.out.println("Ingrese un numero");
            int num=leer.nextInt();
            if (contador == 0) {
                maximo = num;
                minimo = num;
            }
            if (maximo < num) {
                maximo = num;
            } else if (minimo > num) {
                minimo = num;
            }
            promedio += num;
            contador++;
            
            
        }while (contador < n);
    
    promedio /= n;
        System.out.println("El número más grande es: " + maximo);
        System.out.println("El número más chico es: " + minimo);
        System.out.println("El promedio de los números es: " + promedio);
    }
    
    
}
