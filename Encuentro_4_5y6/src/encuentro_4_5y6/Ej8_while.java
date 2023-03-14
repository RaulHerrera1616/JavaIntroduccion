/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está 
entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta
 */
package encuentro_4_5y6;

import java.util.Scanner;


public class Ej8_while {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        float nota=-1;
         
        while (nota<0 || nota>=10){
            System.out.println("Ingrese una nota válida");
            nota = leer.nextFloat();
        }
        System.out.println("la nota ingresada esta entre 0 y 10");
    }
}
