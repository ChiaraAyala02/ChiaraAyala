package mod3y4;

public class Ejercicio19 {
	
	public static void main (String[] args) {
		int i;
		double prom,plus;
		i=0;
		plus=0;
		prom=0;
		
		while(i<=10) {
			i++;
			int random = (int) (Math.random()*10);
			System.out.println(random);
			plus += random;
			prom = plus / 10;
		}
		System.out.println("Suma -----> "+plus);
		System.out.println("Promedio -----> "+prom);
	}
}
