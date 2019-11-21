//Programa que calcula el producto de 3 enteros.
import java.util.Scanner;

public class Productos{

    public static void main(String[] args){

// b) Crea un objeto Scanner llamado entrada que lea los vañlorews de entrada estandar
    Scanner entrada = new Scanner(System.in);

//Crea las variables x, y, z ademas de Resultado enteras.
    double x;
    double y;
    double z;
    double resultado;

//Pide el primer numero

    System.out.print("Dame el primer número:");
//Lee el primer numero
    x = entrada.nextDouble();
//Pide el segundo número
    System.out.print("Dame el segundo número");
//lee el segundo número
    y = entrada.nextDouble();
//Pide el tercer número
    System.out.print("Dame el tercer número");
//Lee el tercer número
    z = entrada.nextDouble();

//Calcula el producto de los 3 enteros y asignale el resultado a la variable resultado.

resultado = x*y*z;

// Muestra el resulado

System.out.println("El resultado es=" + resultado);


    }
}