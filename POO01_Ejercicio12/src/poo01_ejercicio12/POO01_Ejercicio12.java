
package poo01_ejercicio12;


public class POO01_Ejercicio12 {

    
    public static void main(String[] args) {
        double p_hora=5000, retencion=0.125, s_neto, s_bruto, horas = 48;
        int hola = 3;
            retencion =  horas*p_hora*retencion;
            s_bruto = horas*p_hora;
            s_neto = s_bruto - retencion;
            
            System.out.println("Salario bruto: "+s_bruto+" semanales");
            System.out.println("Valor de retencion: "+retencion+" semanales");
            System.out.println("Salario neto: "+s_neto+" semanales");
    }
    
}
