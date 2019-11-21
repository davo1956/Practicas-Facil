public class Factura {

    //Variables de instancia

    private String nombrePieza;
    private int cantidadPieza;
    private double precioPieza;


    public Factura(String nombrePieza, int cantidadPieza, double precioPieza){

        this.nombrePieza = nombrePieza; //asigna nombre de pieza

        if(cantidadPieza > 0){
            this.cantidadPieza = cantidadPieza; // inicializa la cantidad de piezas
        }

        if(precioPieza > 0.0){
            this.precioPieza = precioPieza;
        }
    }

    //Metodos establecer y devulver nombre

    public void establecerNombre(String nombrePieza){
        this.nombrePieza = nombrePieza; 
    }

    public String obtenerNombre(){
        return nombrePieza;
    }

    //Metodos establecer y devolver cantidad

    public void establecerCantidad(int cantidadPieza){
        this.cantidadPieza = cantidadPieza;
    }

    public int obtenerCantidad(){
        return cantidadPieza;
    }

    // Metodos establecer y obtener precio

    public void establecerPrecio(double precioPieza){
        this.precioPieza = precioPieza;
    }

    public double obtenerPrecio(){
        return precioPieza;
    }

    //metodo para precio total

    public void obtenerMontoFactura(int cantidadPieza, double precioPieza) {
        if(cantidadPieza > 0 && precioPieza > 0.0){
            montoFactura = cantidadPieza * precioPieza;
        } else {
            System.out.println("Valor no valido");
        }
    }




}
