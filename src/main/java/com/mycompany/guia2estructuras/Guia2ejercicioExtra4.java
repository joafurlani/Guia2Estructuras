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
public class Guia2ejercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
        //muestre su equivalente en romano.
        
        Scanner leer = new Scanner (System.in);
        
        int numero;
        
        System.out.println("Ingrese un numero del 1 al 10");
        numero=leer.nextInt();
        
        if(numero >= 1 && numero <=10){
            switch (numero){
                case 1:
                    System.out.println("I");
                break;
                case 2:
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7 :
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("VIII");
                    break;
                case 9:
                    System.out.println("IX");
                    break;
                case 10:
                    System.out.println("X");
                    break;   
            }
                
        }else{
            System.out.println("EL numero ingresado no es correcto");
            
        }
        
    }
    
}
