package mod3y4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		int number1, number2, number3;
		
		System.out.print("Ingrese su primer n�mero ----> ");
		number1 = escaner.nextInt();
		System.out.print("Ingrese su segundo n�mero ----> "); 
		number2 = escaner.nextInt();
		System.out.print("Ingrese su tercer n�mero ----> ");
		number3 = escaner.nextInt();
		
		if(number1==number2 && number2==number3) {
			System.out.println("Los tres n�meros son iguales");
		}
		else if(number1>number2 && number2==number3) {
			System.out.println("El primer ("+number1+") n�mero es el mayor");
		}
		else if(number2>number3 && number1==number3) {
			System.out.println("El segundo n�mero ("+number2+") es el mayor");
		}
		else if(number3>number1 && number1==number2) {
			System.out.println("El tercer n�mero ("+number3+") es el mayor");
		}
		else if(number1==number2 && number1>number3) {
			System.out.println("El primer ("+number1+") y segundo ("+number2+") n�mero son los mayores");
		}
		else if(number1==number3 && number1>number2) {
			System.out.println("El primer ("+number1+") y tercer ("+number3+") n�mero son los mayores");
		}
		else if(number2==number3 && number2>number1) {
			System.out.println("El segundo ("+number2+") y tercer ("+number3+") n�mero son los mayores");
		}
		else if(number1>number2 && number2>number3) {
			System.out.println("El primer ("+number1+") n�mero es el mayor");
		}
		else if(number1<number2 && number2<number3) {
			System.out.println("El tercer n�mero ("+number3+") es el mayor");
		}
		else if(number1<number2 && number2>number3) {
			System.out.println("El segundo n�mero ("+number2+") es el mayor");
		}
		escaner.close();
		
	}

}
