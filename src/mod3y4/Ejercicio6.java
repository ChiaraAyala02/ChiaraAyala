package mod3y4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int grade;
		
		Scanner escaner = new Scanner(System.in);
		
		System.out.print("Ingrese los a�os de estudio del sujeto -----> ");
		grade = escaner.nextInt();
		
		if(grade>=0) {
			if(grade==0) {
				System.out.println("El sujeto est� cursando el jard�n de infantes");
			}
			else if(grade>12){
				System.out.println("El sujeto est� cursando una carrera");
			}
			else if(grade<=12){
				if(grade>=7){
					System.out.println("La persona est� cursando la secundaria");
				}
				else if(grade<=6) {
					if(grade>=1) {
						System.out.println("La persona est� cursando la primaria");
					}
					else {
						System.out.println("El sujeto no estudia o ingres� un a�o incorrecto");
					}
				}
			}
		}
		else {
			System.out.println("El sujeto no estudia o ingres� un a�o incorrecto");
		}
		escaner.close();

	}

}
