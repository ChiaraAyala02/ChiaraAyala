package mod3y4;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		char cat;
		int sueldo, año, plus, suma, aumento;
		aumento=0;
		suma=0;
		plus=0;
		System.out.print("Ingrese su categoría -----> ");
		cat = scan.next().charAt(0);
		System.out.print("Ingrese sus años en la empresa -----> ");
		año = scan.nextInt();
		System.out.print("Ingrese su sueldo bruto -----> ");
		sueldo = scan.nextInt();
		
		if(cat=='a'||cat=='b'||cat=='c') {
			if(cat=='a') {
				plus=1000;
			}
			else if(cat=='b') {
				plus=2000;
			}
			else if(cat=='c') {
				plus=3000;
			}
		}
		if(año>0) {
			if(año>=1&&año<=5) {
				aumento=(int)(sueldo*0.05);
			}
			else if(año>=6&&año<=10) {
				aumento=(int)(sueldo*0.1);
			}
			else if(año>=10){
				aumento=(int)(sueldo*0.3);
			}
		}
		suma=(int)(sueldo+aumento+plus);
		
		System.out.println("Su sueldo total es ---->"+suma);
		scan.close();

	}

}
