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
public class Guia2ejercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
        //ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
        //equivalente: 1 día, 2 horas.
    
        double tiempoMinutos, dias, horas;

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un valor de tiempo en minutos: ");
        tiempoMinutos = leer.nextDouble();

        horas = tiempoMinutos / 60; // primero obtenemos el total de horas
        dias = horas / 24; // el valor dias absoluto

        horas = horas - (Math.floor(dias) * 24); // el valor horas - el valor dias en horas redondo - es decir las horas
                                                 // que sobran
        dias = Math.floor(dias); // el valor dias preciso redondeado para abajo

        System.out.println(dias + " Dias");
        System.out.println(horas + " Horas");
    }
    
}
