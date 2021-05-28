package mod3y4;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char Class;

		System.out.print("Coloque la categoría de su vehículo -----> ");
		Class = scan.next().charAt(0);
		
		switch(Class) {
		case 'a': case 'A':
			System.out.println("Su vehículo clase \""+Class+"\" tiene -----> ");
			System.out.println("4 ruedas");
			System.out.println("Un motor");
			break;
		case 'b': case 'B':
			System.out.println("Su vehículo clase \""+Class+"\" tiene -----> ");
			System.out.println("4 ruedas");
			System.out.println("Un motor");
			System.out.println("Sistema de cerradura centralizada");
			System.out.println("Sistema de aire acondicionado");
			break;
		case 'c': case 'C':
			System.out.println("Su vehículo clase \""+Class+"\" tiene -----> ");
			System.out.println("4 ruedas");
			System.out.println("Un motor");
			System.out.println("Sistema de cerradura centralizada");
			System.out.println("Sistema de aire acondicionado");
			System.out.println("Sistema de Airbag");
			break;
		default:
			System.out.println("La clase\""+Class+"\" es inexistente");
			break;
		}
		
		scan.close();

	}

}
