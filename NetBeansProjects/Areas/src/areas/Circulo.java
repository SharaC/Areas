
package areas;
import java.util.Scanner;
/**
 *
 * @author Shara
 */
public class Circulo {
    
    Scanner teclado= new Scanner (System.in);
    double radio;
    double area;
    
        public double Calcula( double radio){
        
        area= Math.pow(radio,2)*(Math.PI);
        return area;
    }
    
}

    

