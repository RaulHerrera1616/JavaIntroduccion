/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar
el mensaje "Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado de la suma de los 
números leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package encuentro_4_5y6;

import java.util.Scanner;

public class Ej9_Do_While {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int suma = 0;
        do {
            System.out.println("Ingrese 20 numeros");
            int num = leer.nextInt();
            cont++;
            if (num > 0) {
                suma = suma + num;
            }
            if (num == 0) {
                break;
            }

        } while (cont < 20);
        System.out.println("La suma de los numeros ingresados exepto los negativos es: " + suma);
    }
}
