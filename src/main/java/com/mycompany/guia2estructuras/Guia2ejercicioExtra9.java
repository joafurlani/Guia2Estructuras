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
public class Guia2ejercicioExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.*/
        
        Scanner leer = new Scanner (System.in);
        int num1, num2;
        int resto, cociente;
        
        System.out.println("Ingrese un numero entero que sea mayor que 1");
        num1=leer.nextInt();
        System.out.println("Ingrese el numero por el cual lo va a dividir");
        num2=leer.nextInt();
        resto= 0;
        cociente = 0;
        
        if (num1 > 1 && num2> 1 ){
            do{
                resto= num1 - num2;
                cociente ++;
                num1 = resto;
            } while (resto >= num2);
        } else {
            System.out.println("LOs numeros ingresado son menores a 1");
        }
        
        System.out.println("EL cociente es " + cociente);
        System.out.println("El resto " + resto);
    }
    
}
