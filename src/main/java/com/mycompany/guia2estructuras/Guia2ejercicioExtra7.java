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
public class Guia2ejercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.*/
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de números que se solicitarán");
        int n = leer.nextInt();

        int valorMaximo = 0, valorMinimo = 0, contador = 0;
        double promedio = 0;
        int num;
        while (contador < n) {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            if (contador == 0) {
                valorMaximo = num;
                valorMinimo = num;
            }
            if (valorMaximo < num) {
                valorMaximo = num;
            } else if (valorMinimo > num) {
                valorMinimo = num;
            }
            promedio += num;
            contador++;
        }
        promedio /= n;
        System.out.println("El número más grande es: " + valorMaximo);
        System.out.println("El número más chico es: " + valorMinimo);
        System.out.println("El promedio de los números es: " + promedio);
    }
    
}
