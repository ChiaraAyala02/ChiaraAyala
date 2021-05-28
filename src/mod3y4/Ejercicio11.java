package mod3y4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		char letter;
		
		System.out.print("Ingrese una letra ----> ");
		letter = escaner.next().charAt(0);
		
		if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u') {
			System.out.println(letter+" es una vocal");
		}
		else {
			System.out.println(letter+" es una consonante");
		}
		escaner.close();
	}

}
