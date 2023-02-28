import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		//@ffrancoreyes - Ejercicio 2/Clase 1 - Argentina Programa
		
		Scanner consola  = new Scanner(System.in);
		//se pide al usuario para que ingrese sus datos para verificarlos con los del INDEC
		System.out.println("Bienvenido al sistema de INDEC, con este sistema vamos a determinar si su hogar, pertenece al segmento de ingresos altos");
		System.out.println("Digite sus ingresos mensuales (En pesos)");
		int ingresosPesos = Integer.parseInt(consola.nextLine());
		System.out.println("Digite la cantidad de Vehiculos con una antigüedad menor a 5 años que el grupo familiar posea (en el caso de no poseer, digite 0)");
		int vehiculos = Integer.parseInt(consola.nextLine());
		System.out.println("Digite la cantidad de inmuebles que posee");
		int inmuebles = Integer.parseInt(consola.nextLine());
		System.out.println("Posee embarcaciones, aeronaves de lujo o activos societarios? (ingrese la cantidad, en el caso de no poseer digite 0)");
		int capacidadEconomica = Integer.parseInt(consola.nextLine());
		
		//determinamos si pertenece a un grupo acomodado o no
		if (ingresosPesos >= 489083 || inmuebles >= 3 || vehiculos >= 3 || capacidadEconomica >= 1 ) {
			System.out.println("Su hogar pertenece al segmento de ingresos altos");
			
		}
		else {
			System.out.println("Su hogar no pertenece al segmento de ingresos altos");
		}
		
		
		
		
	}

}
