package mod3y4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		double mark1, mark2, mark3, prom;
		
		System.out.print("Ingrese la primer nota del alumno -----> ");
		mark1 = escaner.nextDouble();
		System.out.print("Ingrese la segunda nota del alumno -----> ");
		mark2 = escaner.nextDouble();
		System.out.print("Ingrese la tercer nota del alumno -----> ");
		mark3 = escaner.nextDouble();
		
		prom = (mark1+mark2+mark3)/3;
		
		if(prom>=7) {
			System.out.println("El alumno ha aprobado con -----> "+prom);
		}
		else {
			System.out.println("El alumno ha desaprobado con -----> "+prom);
		}
	}

}
