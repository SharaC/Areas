
package poo;
import java.util.Scanner;

public class Fibonacci {
    private int n;
    private int num1;
    private int num2;
    private Scanner teclado = new Scanner(System.in);
    
    
    public void CalcularNnumeros(){
        System.out.println("Introduce la cantidad de terminos de la serie");
        n= teclado.nextInt();
        num1= 1;
        num2= 1;
        System.out.println("Los "+n+" primeros números de la serie Fibonacci son: ");
        System.out.println("1");
        
        for(int i=2;i<=n;i++){
            System.out.println(num2);
            num2=num1+num2;
            num1=num2-num1;
        }
    }
    
}
