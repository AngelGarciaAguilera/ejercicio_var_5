/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.politecnicomalaga.ejercicio_var_5;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner miScan = new Scanner(System.in);
        
        System.out.println("Introduzca su nombre: ");
        String nombre = miScan.nextLine();
        
        System.out.println("Introduzca su dirección: ");
        String direccion = miScan.nextLine();
        
        System.out.println("Introduzca su número de teléfono: ");
        String telefono = miScan.nextLine();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }
}
