
package poo01_ejercicio4;


public class POO01_Ejercicio4 {

   
    public static void main(String[] args) {
        int edad_madre, edad_alberto, edad_ana, edad_juan = 9; 
        edad_alberto=2*(edad_juan/3);
        edad_ana= 4*(edad_juan/3);
        edad_madre = edad_alberto + edad_ana + edad_juan;
        System.out.println("Edad de Alberto:"+edad_alberto);
        System.out.println("Edad de Ana:"+edad_ana);
        System.out.println("Edad de Juan:"+edad_juan);
        System.out.println("Edad de la Mamá:"+edad_madre);
    }
    
}
