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
public class Guia2ejercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Leer la altura de N personas y determinar el promedio de estaturas que
        se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
        general.*/
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa la cantidad de personas a medir");
        int cantidadPersonas = leer.nextInt();
        if(cantidadPersonas > 0){
            int contadorPetisos, contadorGeneral;
            double promedioPetisos, alturaPromedio;
            contadorPetisos = 0;
            contadorGeneral = 0;
            double alturaTotal = 0;
            double alturaPetisosTotal = 0;
            for(int i = 1 ; i <=cantidadPersonas; i++){
                System.out.println("Ingrese el valor de altura del numero: " + i);
                double altura=leer.nextDouble();
                alturaTotal= alturaTotal + altura;
                if(altura < 1.60){
                    contadorPetisos ++;
                    alturaPetisosTotal = alturaPetisosTotal + altura;
                    System.out.println("Promedio petisos");
                }
                contadorGeneral ++;
        }
            promedioPetisos = alturaPetisosTotal / contadorPetisos;
            System.out.println("Promedio altura petisos; " +promedioPetisos);
            alturaPromedio= alturaTotal / contadorGeneral;
            System.out.println("Altura promedio general: " + alturaPromedio);
        }
    }
    
}
