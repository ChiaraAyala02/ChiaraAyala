package mod3y4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		int number1, number2, number3;
		
		System.out.print("Ingrese el primer n�mero -----> ");
		number1 = escaner.nextInt();
		System.out.print("Ingrese el segundo n�mero -----> ");
		number2 = escaner.nextInt();
		System.out.print("Ingrese el tercer n�mero -----> ");
		number3 = escaner.nextInt();
		
		if(number1==number2) {
			if(number3>number1) {
				System.out.println("El tercer n�mero ("+number3+") es el mayor");
			}
			else if(number3<number1){
				System.out.println("El primer ("+number1+") y segundo ("+number2+") n�mero son los mayores");
			}
			else {
				System.out.println("Los tres n�meros son iguales");
			}
		}
		else if(number1==number3) {
			if(number2>number1) {
				System.out.println("El segundo n�mero ("+number2+") es el mayor");
			}
			else if(number2<number1) {
				System.out.println("El primer ("+number1+") y tercer ("+number3+") n�mero son los mayores");
			}
			else {
				System.out.println("Los tres n�meros son iguales");
			}
		}
		else if(number2==number3) {
			if(number1>number2) {
				System.out.println("El primer ("+number1+") n�mero es el mayor");
			}
			else if(number1<number2) {
				System.out.println("El segundo ("+number2+") y tercer ("+number3+") n�mero son los mayores");
			}
			else {
				System.out.println("Los tres n�meros son iguales");
			}
		}
		else if(number1>number2) {
			if(number2>number3) {
				System.out.println("El primer ("+number1+") n�mero es el mayor");
			}
			else if(number3>number2) {
				if(number3>number1) {
					System.out.println("El tercer n�mero ("+number3+") es el mayor");
				}
				else {
					System.out.println("El primer ("+number1+") n�mero es el mayor");
				}
			}
		}
		else if(number1>number3) {
			if(number3>number2) {
				System.out.println("El primer ("+number1+") n�mero es el mayor");
			}
			else if(number2>number3) {
				if(number2>number1) {
					System.out.println("El segundo n�mero ("+number2+") es el mayor");
				}
				else {
					System.out.println("El primer ("+number1+") n�mero es el mayor");
				}
			}
		}
		else if(number3>number2) {
			if(number2>number1) {
				System.out.println("El tercer n�mero ("+number3+")es el mayor");
			}
			else if(number1>number2) {
				if(number1>number3) {
					System.out.println("El primer ("+number1+") n�mero es el mayor");
				}
				else {
					System.out.println("El tercer n�mero ("+number3+") es el mayor");
				}
			}
		}
		else if(number2>number1) {
			if(number1>number3) {
				System.out.println("El segundo n�mero ("+number2+") es el mayor");
			}
			else if(number3>number1) {
				if(number3>number2) {
					System.out.println("El tercer n�mero ("+number3+") es el mayor");
				}
				else {
					System.out.println("El segundo n�mero ("+number2+") es el mayor");
				}
			}
		}
		escaner.close();

	}

}
