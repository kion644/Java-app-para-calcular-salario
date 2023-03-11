/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author 54113
 */
public class EqualsPractica {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    String nombre1 = "" , nombre2 = "" ;
    System.out.print("Ingresa tu 1er nombre: ");
    nombre1 = entrada.nextLine();
    System.out.print("Ingresa tu 2do nombre: ");
    nombre2 = entrada.nextLine();
    
    if (nombre1.equalsIgnoreCase(nombre2)){
    System.out.print("Los nombres son iguales");
    } else {
    System.out.println("Informacion almacenada correctamente");
      System.out.println("Tus nombre son: " + nombre1 + " " + nombre2 );
    }
    
    String usuario = "kion64" , contraseña = "lio123" ;
    System.out.println("Ingresa tu usuario: ");
    usuario = entrada.nextLine();
    System.out.println("Ingresa tu contraseña: ");
    contraseña = entrada.nextLine();
    if(usuario.equals("kion64") && contraseña.equals("lio123")){
    System.out.println("Inicio de sesion correcto");
    } else {
    System.out.println("Usuario o contraseña incorrecto");
    }
    
    }
}