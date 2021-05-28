package mod3y4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		String category;
		
		System.out.print("Coloque su categoría -----> ");
		category = escaner.nextLine();
		
		if(category.equals("a")) {
			System.out.println("Su categoría "+category+" es correspondiente a -----> Hijo o Hija");
		}
		else if(category.equals("b")) {
			System.out.println("Su categoría "+category+" es correspondiente a -----> Padre o Madre");
		}
		else if(category.equals("c")) {
			System.out.println("Su categoría "+category+" es correspondiente a -----> Abuelo o Abuela");
		}
		else {
			
		}
		
		escaner.close();
	}

}
