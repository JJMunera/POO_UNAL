
package poo01_ejercicio5;


public class POO01_Ejercicio5 {

    
    public static void main(String[] args) {
    double suma = 0, x=20, y=40;
        suma = suma + x;
        x = x + Math.pow(y, 2);
        suma = suma + x/y;
        System.out.println("EL VALOR DE LA SUMA ES:"+suma);
    }
    
}
