import java.util.Scanner;

public class EjercicioAreaPerimetro {

	public static void main(String[] args) {
		
		//definimos escaner para obtener datos del usuario
		Scanner consola = new Scanner(System.in);
		//pedimos al usuario el alto y ancho y los convertimos de string a int
		System.out.println("Ingrese el alto:");
		var alto = Integer.parseInt(consola.nextLine());
		System.out.println("Ingrese el ancho:");
		var ancho = Integer.parseInt(consola.nextLine());
		
		//cálculo de perímetro y área
		var perimetro = (alto + ancho )*2;
		var area = alto* ancho;
		
		//resultado
		System.out.println("El Perímetro es: "+ perimetro);
		System.out.println("El Área es: " + area);
		

	}

}
