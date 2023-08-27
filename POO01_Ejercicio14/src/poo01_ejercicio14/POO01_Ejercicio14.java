package poo01_ejercicio14;
import java.util.Scanner;
public class POO01_Ejercicio14 {

    
    public static void main(String[] args) {
       Scanner entrada1 = new Scanner(System.in);
            double x,y,z;
            x = entrada1.nextDouble();
            y = Math.pow(x,2);
            z = Math.pow(x,3);
            System.out.println("El valor del cuadrado es: "+y);
            System.out.println("El valor del cubo es: "+z);
    }
    
}
