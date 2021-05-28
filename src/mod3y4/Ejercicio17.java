package mod3y4;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		System.out.println("¿De qué número desea saber la tabla? -----> ");
		int number, cont, plus;
		number=extracted().nextInt();
		cont=1;
		plus = 0;
		
		while (cont<11) {
			System.out.println(number+"*"+cont+"\t=\t"+(number*cont));
			plus=plus+number*cont*(1-number*cont%2);
			cont++;
		}
		System.out.println("Suma de valores pares -----> "+plus);
	}
	public static Scanner extracted() {
		return new Scanner(System.in);

	}
	

}
