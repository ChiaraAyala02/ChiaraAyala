package mod3y4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		System.out.print("Ingresá un mes -----> ");
		String month = escaner.nextLine();
		
		if(month.equals("enero")) {
			System.out.println("\""+month+"\" tiene 31 días");
		}
		else if(month.equals("marzo")) {
			System.out.println("\""+month+"\" tiene 31 días");
		}
		else if(month.equals("mayo")) {
			System.out.println("\""+month+"\" tiene 31 días");
		}
		else if(month.equals("julio")) {
			System.out.println("\""+month+"\" tiene 31 días");
		}
		else if(month.equals("agosto")) {
			System.out.println("\""+month+"\" tiene 31 días");
		}
		else if(month.equals("octubre")) {
			System.out.println("\""+month+"\" tiene 31 días");
		}
		else if(month.equals("diciembre")) {
			System.out.println("\""+month+"\" tiene 31 días");
		}
		else if(month.equals("febrero")) {
			System.out.println("\""+month+"\" tiene 28 días");
		}
		else if(month.equals("abril")) {
			System.out.println("\""+month+"\" tiene 30 días");
		}
		else if(month.equals("junio")) {
			System.out.println("\""+month+"\" tiene 30 días");
		}
		else if(month.equals("septiembre")) {
			System.out.println("\""+month+"\" tiene 30 días");
		}
		else if(month.equals("noviembre")) {
			System.out.println("\""+month+"\" tiene 30 días");
		}
		else {
			System.out.println("mes incorrecto");
		}
		
		escaner.close();
	}

}
