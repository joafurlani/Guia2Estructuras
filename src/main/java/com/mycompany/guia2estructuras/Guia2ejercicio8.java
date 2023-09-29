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
public class Guia2ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado"); 
       int elementos = leer.nextInt();
       
       for(int i =0; i < elementos; i++){
           for(int j = 0; j < elementos; j++){
               if (i==0 || i == elementos -1 || j ==0 || j == elementos -1){
                   System.out.print(" * ");
               }else {
                   System.out.print("   ");
               }
           }
            System.out.println();
       }
    }
    
}
