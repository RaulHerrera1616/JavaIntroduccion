/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package Extras;

import java.util.Scanner;

public class EjerExtra2_ABCD {

public static void main(String[] args){
        int A, B, C, D, aux;

Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar 4 valores");
A = leer.nextInt();
B = leer.nextInt();
C = leer.nextInt();
D = leer.nextInt();

aux = B;
B = C;
C = A;
A = D;
D = aux;

        System.out.println(" A= " + A);
        System.out.println(" B= " + B );
        System.out.println(" C= " + C );
        System.out.println(" D= " + D);
    }
}
/*
package extras;

import java.util.Scanner;

public class Extra2 {
    public static void main(String[] args){
        int A, B, C, D, aux;

Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar 4 valores");
A = leer.nextInt();
B = leer.nextInt();
C = leer.nextInt();
D = leer.nextInt();

aux = B;
B = C;
C = A;
A = D;
D = aux;

        System.out.println("A: " + A + "B: " + B + "C: " + C + "D: " + D);
    }
}
*/