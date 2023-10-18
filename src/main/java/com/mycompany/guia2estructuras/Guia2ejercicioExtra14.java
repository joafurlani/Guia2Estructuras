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
public class Guia2ejercicioExtra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.*/
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa cuántas familias son");
        int nFamilias = leer.nextInt();
        int totalHijos = 0;
        int totalEdades = 0;
        for (int i = 0; i < nFamilias; i++) {
            System.out.println("Ingrese cuántos hijos tiene la familia " + (i + 1));
            int cantidadHijos = leer.nextInt();
            totalHijos += cantidadHijos;
            for (int j = 0; j < cantidadHijos; j++) {
                System.out.println("Ingresa la edad del hijo " + (j + 1));
                int edadHijo = leer.nextInt();
                totalEdades += edadHijo;
            }
        }
        double edadMedia = (double) totalEdades / totalHijos;
        System.out.println("La edad media de los hijos de todas las familias es de " + edadMedia);
    }
    
}
