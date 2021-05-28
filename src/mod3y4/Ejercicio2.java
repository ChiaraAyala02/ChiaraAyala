package mod3y4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		int number, resto;
		
		System.out.print("Ingresá un número -----> ");
		number = escaner.nextInt();
		
		resto = number%2;

		if(resto==0) {
			System.out.println("El número ingresado es par");
		}
		else{
			System.out.println("El número ingresado es impar");
		}
		
		escaner.close();

	}

}
