package mod3y4;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		int place;
		
		System.out.print("�En que puesto sali� en el torneo? (indique con n�meros) -----> ");
		place = escaner.nextInt();
		
		switch(place) {
		case 1:
			System.out.println("Usted termin� en "+place+"er puesto. Se llev� la medalla de Oro.");
			break;
		case 2:
			System.out.println("Usted termin� en "+place+"do puesto. Se llev� la medalla de Plata.");
			break;
		case 3:
			System.out.println("Usted termin� en "+place+"er puesto. Se llev� la medalla de Bronce.");
			break;
		default:
			System.out.println("Qued� debajo del podio. Siga participando.");
		}
		escaner.close();

	}

}
