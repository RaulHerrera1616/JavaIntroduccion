/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado
seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package encuentro_4_5y6;

import java.util.Scanner;

public class Ej10_For {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int cont = 1;
        System.out.println("Igresa un numero");
        do {

             num = (int) (Math.random() * 21)+1;
            cont++;

            System.out.print(+num);
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }           
            if (cont > 4) {
                break;
            }
            System.out.println(" ");
        } while (num > 0 || num < 21);

    }
}
