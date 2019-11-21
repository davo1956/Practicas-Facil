import java.util.Scanner;

public class PruebaCuenta {

    
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("David Perez", 50.00);
        Cuenta cuenta2 = new Cuenta("Daniel Perez", 4.00);

        // Muestra el saldo inicial de cada objeto.
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        // crea objeto Scenner
        Scanner entrada = new Scanner(System.in);

        // deposito cuenta1
        System.out.print("Escriba el monto que depositara en la cuenta1: ");
        double montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de la cuenta1%n%n", montoDeposito);
        cuenta1.depositar(montoDeposito);

        //DEPO muestrra los saldos

        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        // deposito cuenta2
        System.out.print("Escriba el monto que depositara en la cuenta2: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de la cuenta2%n%n", montoDeposito);
        cuenta2.depositar(montoDeposito);
      
        // DEPO2 muestra de nuevo los saldos

        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        //retiro cuenta1
        System.out.print("Escriba el monto que desea retirar de la cuenta1: ");
        double retiro = entrada.nextDouble();
        System.out.printf("%nrestando %.2f al saldo de la cuenta1%n%n", retiro);
        cuenta1.retirar(retiro);

        //RETI muestra saldos

        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        //Retiro cuenta2
        System.out.print("Escriba el monto que desea retirar de la cuenta2: ");
        retiro = entrada.nextDouble();
        System.out.printf("%nrestando %.2f al sueldo de la cuenta2%n%n", retiro);
        cuenta2.retirar(retiro);

        //RETI2 muestra saldos

        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        }
}
