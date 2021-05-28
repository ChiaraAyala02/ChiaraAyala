package mod3y4;

import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		int number;
		
		System.out.print("Ingrese su número ---->");
		number = escaner.nextInt();
		
		if(number>=1 && number<=12) {
			System.out.println("El número que ingresó está dentro de la primer docena");
		}
		else if(number>=13 && number<=24) {
			System.out.println("El número que ingresó está dentro de la segunda docena");
		}
		else if(number>=25 && number<=36) {
			System.out.println("El número que ingresó está dentro de la tercer docena");
		}
		else if(number<1 || number>36) {
			System.out.println("El número que ingresó está fuera de rango");
		}
		escaner.close();
	}
}
