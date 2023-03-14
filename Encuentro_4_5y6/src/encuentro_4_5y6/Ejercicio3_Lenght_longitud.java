/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
 */
package encuentro_4_5y6;

import java.util.Scanner;



public class Ejercicio3_Lenght_longitud {

   
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String frase;
        System.out.println("Ingrese una palabra o frase");
        frase = leer.next();
        int longi = frase.length();
        
        if (longi==8) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
