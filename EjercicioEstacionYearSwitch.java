import java.util.Scanner;

public class EjercicioEstacionYearSwitch {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("Ingrese el mes del año");
		var mes = Integer.parseInt(consola.nextLine());
		var mesTexto = "Indefinido";
		
		switch (mes) {
		case 1, 2, 12: 
			mesTexto ="Verano";
			break;
		case 3, 4, 5:
			mesTexto ="Otoño";
			break;
		case 6, 7, 8:
			mesTexto ="Invierno";
			break;
		case 9, 10, 11:
			mesTexto ="Primavera";
			break;
			
		default:
			mesTexto ="mes inválido";
			
		}
		System.out.println("Esatción del año: " + mesTexto);
		

	}

}
