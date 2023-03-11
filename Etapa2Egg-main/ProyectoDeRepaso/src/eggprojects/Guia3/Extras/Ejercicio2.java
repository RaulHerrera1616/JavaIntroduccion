/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, 
A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable.
Utilizar sólo una variable auxiliar.
 */
package eggprojects.Guia3.Extras;

public class Ejercicio2 {

    public static void main(String[] args) {
        int A = 0, B = 3, C = 5, D = 6;
        System.out.println("El valor de A es " + A
                + "\nEl valor de B es " + B
                + "\nEl valor de C es " + C
                + "\nEl valor de D es " + D);
        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("El valor de A es " + A
                + "\nEl valor de B es " + B
                + "\nEl valor de C es " + C
                + "\nEl valor de D es " + D);
    }
}
