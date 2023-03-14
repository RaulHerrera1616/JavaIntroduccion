/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
numeros al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package encuentro_4_5y6;

import java.util.Scanner;


public class Ejercicio5_ValorLimite {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int valorLimite;
        int suma=0;
        System.out.println("Ingrese un valor limite positivo");
        valorLimite = leer.nextInt();
        do {            
            System.out.println("Ingrese numeros");
            int num = leer.nextInt();
            suma = suma+num;
        } while (suma<=valorLimite);
        System.out.println("La suma de los números introducidos supera el valor límite inicial");
    }
    
}
