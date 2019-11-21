public class Cuenta {

    private String nombre; // variable de instancia 
    private double saldo; // variable de instancia

    //constructor de cuenta con dos parametros
    public Cuenta(String nombre, double saldo) {

        this.nombre = nombre; //asigna nombre a la variable de clase nombre.

        //valida el saldo si no mantiene el valor.

        if (saldo > 0.0)
            this.saldo = saldo;

    }

    //METODO QUE DEPOSITA SALD0
    public void depositar(double montoDeposito) {

        if (montoDeposito > 0.0)
            saldo = saldo + montoDeposito;

    }

    //METODO QUE DEVUELVE SALDO
    public double obtenerSaldo() {
        return saldo;
    }

    //Establece nombre
    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }

    //DEVUELVE NOMBRE
    public String obtenerNombre() {
        return nombre;
    }

    //Metodo retirar saldo
    public void retirar(double retiro) {

        if (retiro > 0.0){
        saldo = saldo - retiro;
        } else if (retiro > saldo){
            System.out.println("El monto a retirar excede el saldo de la cuenta");
        }  

    


    }

}
