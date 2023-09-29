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
public class Guia2ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().*/
        
        String cadena, FDE, inicial, finale;
        int correctas, incorrectas;
        boolean malNumero, malLimite, malTodo;
        malNumero= false;
        malLimite= false;
        malTodo= false;
        correctas = 0;
        incorrectas = 0;
        FDE = "&&&&&";
        Scanner leer = new Scanner(System.in);
        
        
        do {
            System.out.println("Dispositivo RS232");
        System.out.println("Ingrese una cadena de caracteres");
        cadena=leer.next();
        cadena= cadena.toUpperCase();
        
        inicial= cadena.substring(0, 1);
        finale = cadena.substring(cadena.length() - 1, cadena.length());
        inicial= inicial.toLowerCase();
        finale= finale.toLowerCase();
        
        if(inicial.equals("x") && finale.equals("o")){
            malLimite = false;
            if (cadena.length()>=1 && cadena.length()<=5){
                malNumero = false;
                correctas ++;
            }else {
                malTodo = false;
                malNumero = true;        
            }
        } else {
            malLimite = true;
        }
        
        if (malTodo){
            incorrectas ++;
            
        } else if (malNumero){
            incorrectas ++;
        } else if(malLimite){
            incorrectas ++;
        }
        
        }while(!(cadena.equals(FDE)));
        
        if(cadena.equals(FDE)){
            incorrectas --;
        }
        System.out.println("Correctas: " + correctas);
        System.out.println("Incorrectas : " +incorrectas);
        
        
    }
    
}
