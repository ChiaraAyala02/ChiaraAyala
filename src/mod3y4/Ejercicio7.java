package mod3y4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		int number1, number2, number3;
		
		System.out.print("Ingrese el primer número -----> ");
		number1 = escaner.nextInt();
		System.out.print("Ingrese el segundo número -----> ");
		number2 = escaner.nextInt();
		System.out.print("Ingrese el tercer número -----> ");
		number3 = escaner.nextInt();
		
		if(number1==number2) {
			if(number3>number1) {
				System.out.println("El tercer número ("+number3+") es el mayor");
			}
			else if(number3<number1){
				System.out.println("El primer ("+number1+") y segundo ("+number2+") número son los mayores");
			}
			else {
				System.out.println("Los tres números son iguales");
			}
		}
		else if(number1==number3) {
			if(number2>number1) {
				System.out.println("El segundo número ("+number2+") es el mayor");
			}
			else if(number2<number1) {
				System.out.println("El primer ("+number1+") y tercer ("+number3+") número son los mayores");
			}
			else {
				System.out.println("Los tres números son iguales");
			}
		}
		else if(number2==number3) {
			if(number1>number2) {
				System.out.println("El primer ("+number1+") número es el mayor");
			}
			else if(number1<number2) {
				System.out.println("El segundo ("+number2+") y tercer ("+number3+") número son los mayores");
			}
			else {
				System.out.println("Los tres números son iguales");
			}
		}
		else if(number1>number2) {
			if(number2>number3) {
				System.out.println("El primer ("+number1+") número es el mayor");
			}
			else if(number3>number2) {
				if(number3>number1) {
					System.out.println("El tercer número ("+number3+") es el mayor");
				}
				else {
					System.out.println("El primer ("+number1+") número es el mayor");
				}
			}
		}
		else if(number1>number3) {
			if(number3>number2) {
				System.out.println("El primer ("+number1+") número es el mayor");
			}
			else if(number2>number3) {
				if(number2>number1) {
					System.out.println("El segundo número ("+number2+") es el mayor");
				}
				else {
					System.out.println("El primer ("+number1+") número es el mayor");
				}
			}
		}
		else if(number3>number2) {
			if(number2>number1) {
				System.out.println("El tercer número ("+number3+")es el mayor");
			}
			else if(number1>number2) {
				if(number1>number3) {
					System.out.println("El primer ("+number1+") número es el mayor");
				}
				else {
					System.out.println("El tercer número ("+number3+") es el mayor");
				}
			}
		}
		else if(number2>number1) {
			if(number1>number3) {
				System.out.println("El segundo número ("+number2+") es el mayor");
			}
			else if(number3>number1) {
				if(number3>number2) {
					System.out.println("El tercer número ("+number3+") es el mayor");
				}
				else {
					System.out.println("El segundo número ("+number2+") es el mayor");
				}
			}
		}
		escaner.close();

	}

}
