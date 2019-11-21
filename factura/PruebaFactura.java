import java.util.Scanner;

public class PruebaFactura {

    public static void main(String[] args) {


        Factura factura1 = new Factura("Bolsa", 2, 20);
        Factura factura2 = new Factura("Balon", 3,50);

        //Muestra el nombre de cada objeto y cantidad

        System.out.printf("Lo comprado es %s: $%d%n", factura1.obtenerNombre(), factura2.obtenerCantidad());
        System.out.printf("Lo comprado es %s: $%d%n", factura1.obtenerNombre(), factura2.obtenerCantidad());


        //Muestra el total a pagar 


        
    }

}