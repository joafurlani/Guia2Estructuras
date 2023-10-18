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
public class Guia2ejercicioExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.*/

        Scanner leer = new Scanner(System.in);
        
        int num, pares,impares,contador;
        pares = 0;
        impares = 0;
        contador = 0;
        
        do{
          System.out.println("Ingresa numeros");
            num=leer.nextInt();
            if (num <0){
                System.out.println("Solo ingresa valores positivos");
                break;
            }
            if(num % 2 == 0){
                pares ++;
            }else{
                impares++;
            }
            contador ++;
        }while (!(num % 5 ==0));
        
        System.out.println("Cantidad de  numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);
        System.out.println("Cantidad  de numeros leidos: " + contador);
    }
    
}
