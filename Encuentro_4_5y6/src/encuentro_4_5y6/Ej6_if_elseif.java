
package encuentro_4_5y6;

import java.util.Scanner;


public class Ej6_if_elseif {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1, num2;
        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1>25 && num2>25) {
            System.out.println("Ambos numeros ingresados son mayores a 25");
        }else if(num1>25 || num2>25){
            System.out.println("Uno de los numeros ingresados es mayor a 25");
        }
    }
    
}
