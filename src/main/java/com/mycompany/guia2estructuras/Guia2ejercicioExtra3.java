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
public class Guia2ejercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
        //trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
        //la función equals() de la clase String.
        
        String letra;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una letra ");
        letra=leer.next();
        letra=letra.toLowerCase();
        
        if(letra.equals("a") || letra.equals("e")|| letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("La letra es una Vocal");
            
        } else {
            System.out.println("La letra no es  una vocal");
        }
    }
    
}
