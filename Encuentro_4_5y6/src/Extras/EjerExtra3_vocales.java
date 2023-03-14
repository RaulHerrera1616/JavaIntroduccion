/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;

import java.util.Scanner;
public class EjerExtra3_vocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar una letra");
        String letra = leer.next();
        
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U") ){
            System.out.println("La letra ingresada es una VOCAL");
        }
        else {
            System.out.println("La letra ingresada no es una VOCAL");
        }
        
    }
    
}
/*
package extras;

import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args){

Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar una letra");
        String letra = leer.next();
        
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U") ){
            System.out.println("La letra ingresada es una VOCAL");
        }
        else {
            System.out.println("La letra ingresada es una CONSONANTE");
        }
        
    }
    
}
//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se 
//trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la 
//función equals() de la clase String.
*/