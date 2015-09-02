
package poo;

import java.util.Scanner;

/**
 *
 * @author shara
 */
public class Poo {
    
    
  
            
    public static void main(String[] args) {
    
        Elige objeto= new Elige();
        Scanner teclado= new Scanner (System.in);
        System.out.println("Elija el ejercicio de la practica que desea ejecutar");
        int ejercicio= teclado.nextInt();
        objeto.elegir(ejercicio);
        

            
        
    }
    
}
