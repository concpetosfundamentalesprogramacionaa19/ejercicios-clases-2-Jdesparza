/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class MiEjercicio {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este método es el principal de mi proyeto
        // No olvidar ingresar valores
        
        String nombre;
        String apellido;
        int edad;
        String Ciudad;
        int nota1;
        int nota2;
        double Promedio;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese sus nombres: ");
        nombre = entrada.nextLine();
        
        System.out.println("Por favor ingrese sus apellidos: ");
        apellido = entrada.nextLine();
        
        System.out.println("Por favor ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine(); // Limpieza del buffer de entrada de datos
        
        System.out.println("Por favor ingrese su pais");
        Ciudad = entrada.nextLine();
        
        System.out.println("Ingrese sus notas");
        
        System.out.println("ingrese su primera nota");
        nota1 = entrada.nextInt();
                
        System.out.println("ingrese su segunda nota");
        nota2 = entrada.nextInt();
        
        Promedio = (nota1 + nota2)/2;
        
        
        /**
        System.out.println("Su nombre es:"+nombre+"\n\n\t"+"Su apellido es:"
                +apellido+", edad: "+edad+"\nCiudad: "+ciudad);
        */
        
        System.out.printf("Su nombres y apellidos son %s\nEdad %s"
                +"\nCiudad %s\nNotas %s\nPromedio %s", nombre +" "+apellido, 
                edad,Ciudad, nota1+", "+nota2, Promedio);
    }
    
}
