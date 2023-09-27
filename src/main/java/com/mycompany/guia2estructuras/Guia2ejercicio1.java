/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia2estructuras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2ejercicio1 {

    public static void main(String[] args) {
        //Crear un programa que dado un número determine si es par o impar.;
        
        int num;
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
        
        if(num %2 == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        
    }
}
