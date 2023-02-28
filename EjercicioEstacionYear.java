import java.util.Scanner;

public class EjercicioEstacionYear {

	public static void main(String[] args) {
		//
		Scanner consola = new Scanner(System.in);
		
		//pedimos al usuario que ingrese los datos solicitados y los convertimos a int
		System.out.println("Ingrese el mes del año: ");
		var mes = Integer.parseInt(consola.nextLine());
		if (mes >= 3 && mes <= 6  ) {
			System.out.println("Estamos en Otoño");
		}
		else if(mes >= 7 && mes <= 9) {
			System.out.println("Estamos en Invierno");
		}
		else if(mes >= 10 && mes < 12) {
			System.out.println("Estamos en Primavera");
			
		}
		else if (mes >= 0 && mes <=2) {
			System.out.println("Estamos en Verano ");
		}
		else {
			System.out.println("Ingrese un mes válido");
		}
		
		
		

	}

}
