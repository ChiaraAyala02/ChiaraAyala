package mod3y4;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		char cat;
		int sueldo, a�o, plus, suma, aumento;
		aumento=0;
		suma=0;
		plus=0;
		System.out.print("Ingrese su categor�a -----> ");
		cat = scan.next().charAt(0);
		System.out.print("Ingrese sus a�os en la empresa -----> ");
		a�o = scan.nextInt();
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
		if(a�o>0) {
			if(a�o>=1&&a�o<=5) {
				aumento=(int)(sueldo*0.05);
			}
			else if(a�o>=6&&a�o<=10) {
				aumento=(int)(sueldo*0.1);
			}
			else if(a�o>=10){
				aumento=(int)(sueldo*0.3);
			}
		}
		suma=(int)(sueldo+aumento+plus);
		
		System.out.println("Su sueldo total es ---->"+suma);
		scan.close();

	}

}
