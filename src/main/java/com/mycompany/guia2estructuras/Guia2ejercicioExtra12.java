/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia2estructuras;

/**
 *
 * @author Usuario
 */
public class Guia2ejercicioExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* Necesitamos mostrar un contador con 3 dígitos (X-X-X),
        que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.*/
       
       for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String digito1 = (i == 3) ? "E" : Integer.toString(i);
                    String digito2 = (j == 3) ? "E" : Integer.toString(j);
                    String digito3 = (k == 3) ? "E" : Integer.toString(k);
                    System.out.println(digito1 + "-" + digito2 + "-" + digito3);
                }
            }
        }
    }
    
}
