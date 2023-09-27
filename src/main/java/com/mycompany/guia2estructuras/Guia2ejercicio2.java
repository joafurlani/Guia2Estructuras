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
public class Guia2ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que pida una frase y si esa frase es igual a “eureka” el
        //programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
        //Incorrecto. Nota: investigar la función equals() en Java.
        
        Scanner joa = new Scanner(System.in);
        
        String frase;
        System.out.println("Ingrese una frase");
        frase=joa.next();
        frase=frase.toLowerCase();
        
        if(frase.equals("eureka")){
        System.out.println("correcta");
    } else {
            System.out.println("Incorrecto");
        }
        
    }
    
}
