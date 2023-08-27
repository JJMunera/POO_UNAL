
package poo01_ejercicio17;
import java.util.Scanner;

public class POO01_Ejercicio17 {

    
    public static void main(String[] args) {
        double perimetro, radio, area;
            Scanner entrada = new Scanner(System.in);
            radio = entrada.nextDouble();
            perimetro = 2*Math.PI*radio;
            area = Math.PI*Math.pow(radio, 2);
            System.out.println("El área del circulo es: "+area);
            System.out.println("La longitud de la circunderencia es: "+perimetro);
    }
    
}
