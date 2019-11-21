import java.util.Scanner;

public class Vendedor
{
    public static void main(String[] args){

	//Se crea un objeto Scanner para obtener la entrada en la ventana  de  comandos.
	Scanner entrada = new Scanner(System.in);

	//Definimos las variables relacionadas con los articulos.

        final double A = 239.99;
	final double B = 129.75;
        final double C = 99.59;
        final double D = 350.45;
        final double E = 169.87;

	//Definimos el sueldo inicial.

	final int Sueldo = 200;

	//Variables normales o clasicas paraVentas(Se relaciona con el total de articulos)y GananciasVentas(Venta y ganacia total con el 9%)

        double Ventas;
	double VentasTotales;
       	
	double GananciaVentas;

	int ArticuloA; //Valor del total de cada articulo A
	int ArticuloB; //Valor del total de cada articulo B
	int ArticuloC; //Valor del total de cada articulo C
	int ArticuloD; //Valor del total de cada articulo D
	int ArticuloE; //Valor del total de cada articulo E
	double SueldoTotal; //El 9% de las ventas sumado con los 200 semanales.

	//total de ventas de cada articulo

	double TotalA;
	double TotalB;
	double TotalC;
	double TotalD;
	double TotalE;

	//entrada

	System.out.printf("Escriba los articulos de A: ");
	ArticuloA = entrada.nextInt();
        TotalA = A * ArticuloA;

	System.out.printf("Escriba los articulos de B: ");
	ArticuloB = entrada.nextInt();
        TotalB = B * ArticuloB;
	

	System.out.printf("Escriba los articulos de C: ");
	ArticuloC = entrada.nextInt();
        TotalC = C * ArticuloC;

	System.out.printf("Escriba los articulos de D: ");
	ArticuloD = entrada.nextInt();
        TotalD = D * ArticuloD;
	

	System.out.printf("Escriba los articulos de E: ");
	ArticuloE = entrada.nextInt();
	TotalE = E * ArticuloE;
	

	//Total de la suma de los articulos totales de A, B, C, D y E

	//En Articulos se asignaron los valores de el valor dado por el cliente multiplicado por el valor del articulo que corresponde.

	Ventas = TotalA + TotalB + TotalC + TotalD + TotalE;

	System.out.println("Total de ventas es: " + Ventas);

	// En Ganacias Totales es igual a el Valor de ventas por 0.09 para sacar el valor de las ganacias por la venta de los articulos

	GananciaVentas = Ventas * 0.09;

	System.out.println("El dinero ganado por el total de ventas es; " + GananciaVentas);

	SueldoTotal = GananciaVentas + Sueldo;

	System.out.println("El resultado del sueldo total es: " + SueldoTotal);

      
    }
}
