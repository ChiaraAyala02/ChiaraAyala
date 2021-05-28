package mod3y4;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		int place;
		
		System.out.print("¿En que puesto salió en el torneo? (indique con números) -----> ");
		place = escaner.nextInt();
		
		switch(place) {
		case 1:
			System.out.println("Usted terminó en "+place+"er puesto. Se llevó la medalla de Oro.");
			break;
		case 2:
			System.out.println("Usted terminó en "+place+"do puesto. Se llevó la medalla de Plata.");
			break;
		case 3:
			System.out.println("Usted terminó en "+place+"er puesto. Se llevó la medalla de Bronce.");
			break;
		default:
			System.out.println("Quedó debajo del podio. Siga participando.");
		}
		escaner.close();

	}

}
