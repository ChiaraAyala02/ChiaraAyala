package mod3y4;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner escaner = new Scanner(System.in);
		
		int number, i, result;
		result = 0;
		
		System.out.println("¿De qué número desea saber la tabla? -----> ");
		number = escaner.nextInt();
		
		for(i=1; i<=10; i++) {
			result=number*i;
			System.out.println(number+" * "+i+" = "+result);
		}
		escaner.close();
		
	}

}
