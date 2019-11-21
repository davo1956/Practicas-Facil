import java.util.Scanner;

public class Ejercicos{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        

        System.out.print("Dame el valor del número 1: " );
        numero1 = entrada.nextInt();

        System.out.print("Dame el valor del número 2: ");
        numero2 = entrada.nextInt();

        System.out.print("Dame el valor del número 3: ");
        numero3 = entrada.nextInt();

        System.out.print("Dame el valor del número 4: ");
        numero4 = entrada.nextInt();

        System.out.print("Dame el valor del número 5: ");
        numero5 = entrada.nextInt();

//REGRESA EL VALOR DE LOS NUMEROS QUE INGRESAMOS

        System.out.println("El número 1 es:" + numero1);
        System.out.println("El número 2 es:" + numero2);
        System.out.println("El número 3 es:" + numero3);
        System.out.println("El número 4 es:" + numero4);
        System.out.println("El número 5 es:" + numero5);


//REVISA EL MAYOR DE LOS 5 NUMEROS O SI SON IGUALES


        if(numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1 > numero5){
            System.out.println("El mayor es: " + numero1);
        } else if(numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5){
            System.out.println("El mayor es:" + numero2);
        } else if(numero3 > numero1 && numero3 > numero2 && numero3 > numero4 && numero3 > numero5){
            System.out.println("El mayor es: " + numero3);
        } else if(numero4 > numero1 && numero4 > numero2 && numero4 > numero3 && numero4 > numero5){
            System.out.println("El mayor es: " + numero4);
        } else if(numero5 > numero1 && numero5 > numero2 && numero5> numero3 && numero5 > numero4){
            System.out.println("El mayor es: " + numero5);
        } else {
            System.out.println("Los números son iguales");
        }

        

    

         
        
    }
} 
