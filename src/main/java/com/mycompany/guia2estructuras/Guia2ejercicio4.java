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
public class Guia2ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que pida una frase o palabra y valide si la primera
        //letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
        //imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
        //contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
        //Substring y equals() de Java.
        
        String frase;
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una frase");
        frase=leer.next();
        frase= frase.toLowerCase();
        if(frase.substring(0,1).equals("a")){
            System.out.println("Correcto");
                    
        } else {
            System.out.println("Incorrecto");
        }
        
    }
    
}
