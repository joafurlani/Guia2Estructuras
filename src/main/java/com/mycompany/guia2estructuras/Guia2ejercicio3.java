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
public class Guia2ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que solo permita introducir solo frases o palabras
        //de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
        //deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
        //caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
        //función Lenght() en Java.
        
        String frase;
        int longitud;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una frase");
        frase= leer.next();
        longitud = frase.length();
        
        if (longitud == 8 ){
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
                    
        }
               
        
    }
    
}
