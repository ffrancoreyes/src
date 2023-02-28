import java.util.Scanner;

public class EjercicioCalificaciones {

	public static void main(String[] args) {
		
		//usamos scanner para que el usuario ingrese los datos
		Scanner consola = new Scanner(System.in);
		
		//se pide al usuario los datos y se los pasa de string a int, a la par se crea una variable para luego mostrar la nota final
		System.out.println("Ingrese la calificación");
		var calificacion = Integer.parseInt(consola.nextLine());
		var notaFinal= "Indefinido";
		
		//determinamos cual es la calificacion final del alumno
		 switch (calificacion){
		 case 0, 1, 2, 3, 4, 5:
			notaFinal = "F";
		 	break;
		 	
		 case 6:
			 notaFinal = "D";
		 	break;
		 case 7:
			 notaFinal = "C";
			 break;
		 case 8:
			 notaFinal = "B";
			 	break;
		 case 9, 10: 
			 notaFinal = "A";
		 	break;
		 default: 
			 notaFinal = "Ingrese una calificación válida";
		
		 
		 }
		 //devolvemos al usuario la calificacion final del alumno
		 System.out.println("Calficiación Final: " + notaFinal);
	}

}
