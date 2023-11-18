package figuras;

/**
* Esta clase define el punto de ingreso al programa de figuras 
* geométricas. Por lo tanto, cuenta con un método main de acceso al programa.
*/
public class Principal {
    /**
    * Método main que sirve de punto de entrada al programa
    */
    public static void main(String[] args){
        Ventana_principal miVentanaPrincipal; /* Define la ventana 
            principal */
        miVentanaPrincipal= new Ventana_principal(); /* Crea la ventana 
            principal */
        miVentanaPrincipal.setVisible(true); /* Establece la ventana 
                como visible */
        // Establece que la ventana no puede cambiar su tamaño
        miVentanaPrincipal.setResizable(false);
    }
}
 