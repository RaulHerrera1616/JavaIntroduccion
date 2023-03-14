/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

*/
package encuentro_4_5y6;

import java.util.Scanner;

public class Ecercicio8_AsteriscosCuad_for {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        System.out.println("Ingresa un numero");
        N = leer.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i>0 && i<N-1 && j>0 && j<N-1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println(" ");
        }

    }
}