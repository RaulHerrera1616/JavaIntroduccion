package ejercicios_estructura_de_control;

import java.util.Scanner;

public class ejericio7 {

    /**
     Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
     Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X
     y el último tiene que ser una O.
     Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
     y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
     Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
     Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
     * @param args   
     */
    
    public static void main(String[] args) {
      
     Scanner entrada = new Scanner(System.in);
     
     String cad;
     int cont1=0,cont2=0;
    
    do {
     
        
     System.out.println("Ingrese una cadena");
     cad = entrada.nextLine();
     
      
     
     if(cad.substring(0,1).equalsIgnoreCase("x") && cad.substring(4,5).equalsIgnoreCase("o")  && cad.length() == 5){
     
     cont1++;
     }
     else{
     cont2++;
     }
     
        
        
    } while (!cad.equals("&&&&&"));
    
     System.out.println("Correctas = " + cont1);
        
     System.out.println("Incorrectas = " + cont2);
   
    
    
        
        
        
        
    }
    
}