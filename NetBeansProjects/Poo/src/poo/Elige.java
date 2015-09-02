/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author est09
 */
public class Elige {
    Scanner teclado= new Scanner (System.in);
    int ejercicio;
    
    
    public void elegir(int ejercicio){

      //Poo objeto = new Poo();
         switch (ejercicio) {

            case 13:
                Fibonacci fibo= new Fibonacci();    
                fibo.CalcularNnumeros();
                    
            break;

            case 14:
                

            break;

            case 15:
                

            break;    

            case 16:
               

            break;    

            case 17:
                

            break;

            case 18:
             
            break;

            case 19:
                
            break;

            
            default:
            System.out.println("por favor ingrese un numero del 13 al 19");
            break;

     }
        
    }
    
}
