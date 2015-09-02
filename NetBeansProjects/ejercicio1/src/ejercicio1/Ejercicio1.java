
package ejercicio1;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;
//import java.lang.String;
/**
 *
 * @author Shara
 */

 

    


public class Ejercicio1 {

    double area;
    double volumen;
    double a;
    double b;
    double c;
    
    private Scanner teclado;
    int ejercicio;
    




public void inicializar(){
    
    teclado= new Scanner (System.in);
    System.out.println("Elija el ejercicio de la practica que desea ejecutar");
    ejercicio= teclado.nextInt();
    Ejercicio1 objeto = new Ejercicio1();
     switch (ejercicio) {
         
        case 1:
        
            //Ejercicio1 cubo1= new Ejercicio1();
        
            objeto.cubo();    
        break;
 
        case 2:
            //Ejercicio1 triangulo1= new Ejercicio1();    
            objeto.triangulo();
        
        break;
        
        case 3:
            //Ejercicio1 triangulo2= new Ejercicio1();
            objeto.equilatero();
        
        break;    
        
        case 4:
           // Ejercicio1 nota= new Ejercicio1(); 
            objeto.notas();
            
        break;    
        
        case 5:
            Ejercicio1 nota2= new Ejercicio1();
            objeto.notas2();
        
        break;
            
        case 6:
        //    Ejercicio1 producto= new Ejercicio1();
            objeto.maquina();
        
        break;
           
        case 7:
            System.out.println("preguntar al profe como se hace este");
         
        break;
            
        case 8:
//      Ejercicio1 numero = new Ejercicio1();
            objeto.digitos();
         
        break;
            
        case 9:
            objeto.generaNum();
            
        break;    
         
        case 10:
            objeto.Fibonacci();
        
        break; 
            
        case 11:
            objeto.Factorial();
            
        break;
        default:
        System.out.println("por favor ingrese un numero del 1 al 12");
        break;
 
 }
    }
public void cubo(){
    teclado= new Scanner (System.in);
    System.out.println("ingrese la medida de una arista en cm");
    a = teclado.nextDouble();
    area= 6*(Math.pow(a,2));
    volumen= Math.pow(a,3);
    System.out.println("El area del cubo es: "+area+" cm cuadrados");
    System.out.println("El volumen del cubo es: "+volumen+"cm cúbicos");
}

public void triangulo(){
    teclado= new Scanner (System.in);
    System.out.println("ingrese la medida de uno de los lados del triangulos en cm");
    a= teclado.nextDouble();
    System.out.println("ingrese la medida del otro lado del triangulos en cm");
    b= teclado.nextDouble();
    c= Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));
    System.out.println("La hipotenusa del triangulo es: "+c);
}

public void equilatero(){
    teclado= new Scanner (System.in);
    System.out.println("ingrese la medida del lado del triángulo en cm");
    a=teclado.nextDouble();
    double perimetro= 3*a;
    double base= a/2;
    double altura= Math.sqrt((Math.pow(a,2))-(Math.pow(base,2)));
    double area= (base*altura)/2;
    
    System.out.println("El perímetro del triangulo es: "+perimetro+" cm");
    System.out.println("La altura del triangulo es: "+altura+" cm");    
    System.out.println("El área del triángulo es"+area+" cm cuadrados");
    
}

public void notas(){
    teclado= new Scanner (System.in);
    System.out.println("Ingrese la nota obtenida en el seguimiento");
    double seg= teclado.nextDouble();
    System.out.println("Ingrese la nota obtenida en el parcial I");
    double par1= teclado.nextDouble();
    System.out.println("Ingrese la nota obtenida por el parcial II");
    double par2=teclado.nextDouble();
    double def= seg*0.5+par1*0.25+par2*0.25;
    System.out.println("La nota definitiva es: "+def);
}

public void notas2(){
    teclado=new Scanner (System.in);
    System.out.println("Ingrese la nota obtenida en el seguimiento y quices");
    double seg= 0.2*teclado.nextDouble();
    System.out.println("Ingrese la nota obtenida en el laboratorio");
    double lab= 0.3*teclado.nextDouble();
    System.out.println("Ingrese la nota obtenida en las exposiciones");
    double expo= 0.1*teclado.nextDouble();
    System.out.println("Ingrese la nota obtenida en proyecto I");
    double pro1= 0.15*teclado.nextDouble();
    System.out.println("Ingrese la nota obtenida en el proyecto final");
    double profinal= 0.25*teclado.nextDouble();
    double definitiva= seg+lab+expo+pro1+profinal;
    System.out.println("La nota definitiva del curso es "+definitiva);
    if(definitiva>=0 && definitiva<=1){
        System.out.println("Estás en el lugar equivocado");
    } else if (definitiva>1 && definitiva<=2){
        System.out.println("Remal!");
    } else if (definitiva>2 && definitiva<=3){
        System.out.println("Es posible recuperarse");
    } else if (definitiva>3 && definitiva <=4){
        System.out.println("Muy bien!");    
    } else {
        System.out.println("Excelente estudiante");
    }   
    
    
        
}

public void maquina(){
    teclado= new Scanner(System.in);
    System.out.println("Ingrese el numero del producto que desea ");
    int producto= teclado.nextInt();
    int precio=0;
    switch (producto){
        
        case 1:
            precio= 500;
        break;
            
        case 2:
            precio=800;
        break;
            
        case 3:
            precio= 300;
        break;
            
        case 4:
            precio= 900;
        break;
        
        default:
            System.out.println("Ingrese un numero de producto entre 1 y 4");
    }
    System.out.println("El precio del producto elegido es: "+precio);
}

public void digitos(){
    teclado= new Scanner(System.in);
    System.out.println("Ingrese dos números de dos dígitos cada uno y separados por coma, asi: Numero1,Numero2");
    String numeros= teclado.next();
    //System.out.println(numeros);
    char a[]= new char[numeros.length()];
    a= numeros.toCharArray();
    int s= Integer.parseInt(String.valueOf(a[1]));
    String numA= String.valueOf(a[0])+String.valueOf(a[1]);
    int num1=Integer.parseInt(numA);
    String numB= String.valueOf(a[3])+String.valueOf(a[4]);
    int num2=Integer.parseInt(numB);
    
    //System.out.println(num1+num2);
    switch (s){
        case 0:
            if(num1>num2){
                System.out.println("el número mayor es :"+num1);
        }       else if(num2>num1){
                    System.out.println("el número mayor es :"+num2);    
                        } else{
                            System.out.println("Los números son iguales");
        }
        break;    
        
        case 1:
            if(num1<num2){
                System.out.println("el número menor es :"+num1);
        }       else if(num2<num1){
                    System.out.println("el número menor es :"+num2);    
                        } else{
                            System.out.println("Los números son iguales");
        }
        break;
            
        case 2:
            int suma= num1+num2;
            System.out.println("La suma de los números es: "+suma);
            
        break;
            
        case 3:
            int resta= num1-num2;
            System.out.println("La resta de los números (Número1-Número2) es: "+resta);
        
        break;
        
        case 4:
            int mult= num1*num2;
            System.out.println("La multiplicación de los números es: "+mult);
            
        break;
            
        case 5:
            double div= (double)num1/num2;
            System.out.println("La división de los números (Número1/Número2) es: "+div);
            
        break;
            
        case 6:
            if(num1%num2==0){
                System.out.println("El número "+num1+" Si es divisible por "+num2);
            }else {
                System.out.println("El número "+num1+" No es divisible por "+num2);
            }
        
        break;
            
        case 7:
            if(num2%num1==0){
                System.out.println("El número "+num2+" Si es divisible por "+num1);
            }else {
                System.out.println("El número "+num2+" No es divisible por "+num1);
            }
        
        break;
            
        case 8:
            double raiz= Math.sqrt((double)num1);
            System.out.println("La raiz cuadrada de "+num1+" es: "+raiz);
          
        break;
            
        case 9:
            System.out.println("Que punto tan fácil parce...");
            
        break;
         
        default:
        System.out.println("Por favor verifique que ingresó los números en forma correcta");    
    }
    
    
    
}

public void generaNum(){
    String [] arreglo= new String [10];
        
    for ( int i=10;i>=1;i--){
        
        arreglo[i-1]= Integer.toString(i);
       
    }
    System.out.println(Arrays.toString(arreglo));
      
}
public void Fibonacci(){
    
    teclado= new Scanner(System.in);
    System.out.println("introduzca un número de 2 cifras");
    int numero= teclado.nextInt();
    double num1=Math.sqrt((5*(Math.pow(numero,2)))+4);
    double num2=Math.sqrt((5*(Math.pow(numero,2)))-4);
    if (((num1%1) == 0) || (num2%1)== 0){
        System.out.println("El número: "+numero+" pertenece a la serie Fibonacci");
    }
    else 
        System.out.println("El número: "+numero+" No pertenece a la serie Fibonacci");
}

public void Factorial(){
    teclado = new Scanner(System.in);
    System.out.println("Ingrese un número entero");
    int numero= teclado.nextInt();
    float factorial=1;
    
   

    for(int i=1;i<=numero;i++){
        factorial=factorial*i;
    
    System.out.println("el factorial de "+i+" es "+factorial);
    }   
      /* while(numero!=0){
        factorial= factorial*numero;
        numero--;
    }*/
    
}
    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
       Ejercicio1 comenzar= new Ejercicio1();
       comenzar.inicializar();
       
       
       

        
    }
}    
    

