import java.util.Scanner;
//import java.lang;

import sun.security.util.Length;

public class Ejercicios2{

    public static void main(String[] args){

        double numero; 
        double primero;
        double segundo;
        double tercero;
        double cuarto;
        double quinto;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame el número de 5 digitos: ");

        numero = entrada.nextInt();

        

        if(numero.length == 5){

        quinto = numero/10;

        numero = numero/10;
        cuarto = numero%10;

        numero = numero/10;
        tercero = numero%10;

        numero = numero/10;
        segundo = numero%10;

        numero = numero/10;
        primero = numero%10;

        System.out.printf("Los numero son: ");
        System.out.printf("%d   %d   %d   %d   %d   /n", primero, segundo, tercero, cuarto, quinto);
        } else {
            System.out.println("No tiene 5 digitos");
        }


    }
}
