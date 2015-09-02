
package areas;
import java.util.Scanner;


/**
 *
 * @author Shara
 */
public class Areas {

    public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                int menu=0;
        do{System.out.println("Para conocer el area del circulo ingrese: 1, para el caso del Rectangulo: 2, "
                + "para el caso del Triangulo: 3, para el caso del cuadrado: 4 ");
        int select= teclado.nextInt();
        
       // Rectangulo recta1= new Rectangulo();
        //Triangulo trian1= new Triangulo();
        //cuadro cuadro1= new cuadro();
        
        
        switch (select) {
            
            case 1:
                System.out.println("Ingrese el radio del circulo");
                double radio= teclado.nextDouble();
                Circulo circulo1= new Circulo();
                double area= circulo1.Calcula(radio);
                System.out.println(area);
            break;
                
            case 2:
                System.out.println("Ingrese la medida de la base del rectangulo");
                double base= teclado.nextDouble();
                System.out.println("Ingrese la medida de la altura del rectangulo");
                double altura= teclado.nextDouble();
                Rectangulo rec1= new Rectangulo();
                area= rec1.calcula(base,altura);
                System.out.println(area);
                
                break;   
            
            default:
                menu=1;
                
        } 
        } while(menu==0);
     

    }
    
}
