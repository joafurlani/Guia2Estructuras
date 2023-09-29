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
public class Guia2ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar un programa que pida dos números enteros positivos por
        teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.*/
        
        
           int num1, num2, opcion;
           String  confirma;
           boolean confirmacion;
           
           confirmacion= false;
           
           Scanner leer = new Scanner(System.in);
           System.out.println("Ingrese el primer numero");
           num1=leer.nextInt();
           System.out.println("INgrese el segundo numero");
           num2=leer.nextInt();
           
           do{
               System.out.println("=====================");
               System.out.println("MENU");
               System.out.println("1_Sumar");
               System.out.println("2_Restar");
               System.out.println("3_Multiplicar");
               System.out.println("4_Dividir");
               System.out.println("5_Salir");
               System.out.println("Elija la opcion segun el numero");
               opcion=leer.nextInt();
               if(opcion>=1 && opcion<=4){
                  switch(opcion ){
                      case 1:
                            System.out.println("La sumas de los numeros es: " + (num1+num2));
                            break;
                      
                      case 2:
                          System.out.println("La resta de los numeros es:" + (num1 - num2));
                          break;
                          
                      case 3:
                          System.out.println("La multiplicaciones de los numeros es: " + (num1 * num2));
                          break;
                          
                      case 4:
                          System.out.println("La division de los numeros es: " + (num1 / num2));
                          break;
                      }  
                  
               } else if(opcion == 5){
                   System.out.println("Esta seguro que quiere salir del programa  S/N");
                   confirma=leer.next();
                   confirma=confirma.toUpperCase();
                   
                   if(confirma.equals("S")){
                     System.out.println("Saliendo del programa"); 
                     confirmacion = true;
                   } else{
                       
                       
                       continue;
                   }
                   
               } else {
                   System.out.println("Solo valores de 1 a 5");
                   System.out.println("==================");
               }
              
               
           } while(!confirmacion);
    
    }
    
    
}
