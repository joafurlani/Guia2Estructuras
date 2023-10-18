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
public class Guia2ejercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.*/
        
        String respuesta;
        double valorTratamiento;
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa la categoria de socio A, B o C");
        respuesta=leer.next();
        respuesta=respuesta.toLowerCase();
        if(!(respuesta.equals("a")) && !(respuesta.equals("b")) && !(respuesta.equals("c"))){
            System.out.println("Ingrese una categoria de socio valida");
    } else {
            if(respuesta.equals("a")){
                System.out.println("Ingrese el valor del tratamiento");
                valorTratamiento=leer.nextDouble();
                System.out.println("El valor del tratamiento es de " + (valorTratamiento - (valorTratamiento * 0.05)));
            }
            if(respuesta.equals("b")){
                System.out.println("Ingrese el valor del tratamiento");
                valorTratamiento=leer.nextDouble();
                System.out.println("El valor del tratamiento es " + (valorTratamiento -(valorTratamiento * 0.35)));
            }
            System.out.println("Ingrese el valor del tratamiento");
                valorTratamiento=leer.nextDouble();
                System.out.println("El valor del tratamiento es de " + valorTratamiento);
        }
        
        
    }
    
}
