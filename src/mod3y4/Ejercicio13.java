package mod3y4;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		System.out.print("Ingres� un mes ----> ");
		String month = escaner.nextLine();
		
		switch(month){
		case "febrero":
			System.out.println("\""+month+"\" tiene 28 dias");
			break;
		case "abril": case "junio": case "septiembre": case "noviembre":
			System.out.println("\""+month+"\" tiene 30 d�as");
			break;
		case "enero": case "marzo": case "mayo": case "julio": case "agosto": case "octubre": case "diciembre":
			System.out.println("\""+month+"\" tiene 31 d�as");
			break;
		default:
			System.out.println("Ingres� un mes incorrecto o no ingres� alguno.");
		}
		escaner.close();

	}

}
