import java.util.Scanner;

public class EjercicioMayorDeDosnumeros {

	public static void main(String[] args) {
		//Declaramos que vamos a usar Scanner para obtener datos del usuario
		Scanner consola = new Scanner(System.in);
		
		//pedimos al usuario los números y los convertimos de string a int
		System.out.println("ingrese número 1: ");
		var numA = Integer.parseInt(consola.nextLine());
		System.out.println("ingrese número 2: ");
		var numB = Integer.parseInt(consola.nextLine());
		
		//determinamos si uno es mayor o menor que el otro y mostramos el resultado al usuario
		if (numA > numB) {
		System.out.println(numA + " es mayor que "+ numB);
		}
		else {
			System.out.println(numB + " es mayor que "+ numA);
		}

	}

}
/*
* "cambios extraños que hay en mi?????"
*
*/
