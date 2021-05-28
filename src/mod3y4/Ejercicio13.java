package mod3y4;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		System.out.print("Ingresá un mes ----> ");
		String month = escaner.nextLine();
		
		switch(month){
		case "febrero":
			System.out.println("\""+month+"\" tiene 28 dias");
			break;
		case "abril": case "junio": case "septiembre": case "noviembre":
			System.out.println("\""+month+"\" tiene 30 días");
			break;
		case "enero": case "marzo": case "mayo": case "julio": case "agosto": case "octubre": case "diciembre":
			System.out.println("\""+month+"\" tiene 31 días");
			break;
		default:
			System.out.println("Ingresó un mes incorrecto o no ingresó alguno.");
		}
		escaner.close();

	}

}
