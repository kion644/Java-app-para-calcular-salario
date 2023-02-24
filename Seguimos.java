/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quealpedoestoy;
import java.util.Scanner;
/**
 *
 * @author 54113
 */
public class Seguimos {
    public static void main(String[] args){
    System.out.println("#####################################################");
    System.out.println("########### HOLA ########################################");
    System.out.println("########### BIENVENIDO AL CALCULADOR DE SALARIO ###########");
    System.out.println("###########################################################");
    System.out.println("");
    System.out.println("");
       System.out.println("Tener en cuenta que esta empresa se formo en 2020 y el total de proyectos desde entonces es de 5");
    Scanner in = new Scanner(System.in);
    String nombre = "";
    int añoDeInicio = 0 , proyectosTrabajados = 0 ;
    System.out.println("Indique su nombre por favor");
    nombre = in.nextLine();
     System.out.println("Indique su año de inicio por favor");
     añoDeInicio = in.nextInt();
    System.out.println("Indique la cantidad de proyectos trabajados por favor");
     proyectosTrabajados = in.nextInt();
     
     if (añoDeInicio == 2020){
         if (proyectosTrabajados >= 5){
             System.out.println("Su sueldo corresponde a $300.000 " + "" + nombre);
         }
     } else if (añoDeInicio > 2020 && añoDeInicio < 2023){
         if (proyectosTrabajados > 0 && proyectosTrabajados < 5){
         System.out.println("Su sueldo corresponde a $250.000 " + "" + nombre);
     }
     }
     else if (añoDeInicio == 2023){
      if ( proyectosTrabajados <= 1){
            System.out.println("Su sueldo corresponde a $150.000" + "" + nombre);
      }
     }
     else if (añoDeInicio < 2020 || proyectosTrabajados > 5) {
         System.out.println("La operacion no existe " + "" + nombre);
     }
}
}
