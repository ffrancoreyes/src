import java.util.Scanner;

public class Ejercicio2 {

	//@ffrancoreyes - Ejercicio 1/Clase 1 - Argentina Programa
	
	public static void main(String[] args) {
		
		Scanner consola = new Scanner(System.in);
		
		//definimos variables inciales
		
		System.out.println("punto 1 del ejercicio 1");
		var numInicio = 5;
		var numFin = 14;
		
		//mostramos los números del 5 al 14
		while (numInicio <= numFin) {
			System.out.println(numInicio);
			numInicio++;
		}
		
		System.out.println("punto 2 del ejercicio 1");
		
		//volvemos al punto inicial al numInicio
		numInicio = 5;
		
		//elegimos mostar los pares desde el 5 al 14
		while (numInicio<=numFin) {
			if (numInicio % 2 == 0) {
				System.out.println(numInicio);
				
			}
			numInicio++;
		}
		
		System.out.println("punto 3 del ejercicio 1");
		System.out.println("ingrese una opción >>par o impar<<");
		var respuesta = consola.nextLine();
		//volvemos al punto inicial al numInicio
		numInicio = 5;
		
		
		//definimos las posibles respuestas y los posibles resultados
		switch(respuesta) {
		case "par", "Par": 
			while (numInicio<=numFin) {
				if (numInicio % 2 == 0) {
					System.out.println(numInicio);
					
				}
				numInicio++;
			}
			break;
		case "impar", "Impar":
			while (numInicio<=numFin) {
				if (numInicio % 2 != 0) {
					System.out.println(numInicio);
					
				}
				numInicio++;
				
		
		}
		break;
		default:
			System.out.println("ingrese una opción válida");
		
		
		
		
		
		
		
		
		}
		System.out.println("punto 3 del ejercicio 1");
		//mostramos los números del 14 al 5
		
		numInicio = 5;
		
				while (numFin >= numInicio) {
					System.out.println(numFin);
					numFin--;
				}
		

	}
}


