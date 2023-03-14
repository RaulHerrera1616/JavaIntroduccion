/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla 
el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado 
por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package encuentro_4_5y6;

import java.util.Scanner;

public class Ejercicio6_Menu {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        String confir = null;
        int opcion;
        System.out.println("Ingrese dos numeros enteros positivos");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println(" ");
            System.out.println("Elija opción:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    int suma = num1+num2;
                    System.out.println("La suma entre los dos numeros es: " +num1+ " + "  +num2+ " = "+suma);
                    break;
                case 2:
                    int resta = num1-num2;
                    System.out.println("La resta entre los dos numeros es: " +num1+ " - "  +num2+ " = " +resta);
                    break;
                case 3:
                    int mult = num1*num2;
                    System.out.println("La multiplicacion entre los dos numeros es: " +num1+ " x "  +num2+ " = " +mult);
                    break;
                case 4:
                    double div = num1/num2;
                    System.out.println("La división entre los dos numeros es: " +num1+ " / "  +num2+ " = " +div);
                    break;
                case 5:
                    
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    confir = leer.next();
                    break;
            }
        } while (opcion!=5 ||  confir.equalsIgnoreCase("N"));

    }

}
