package mod3y4;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		int i, random;
		double min, max;
		random = 0;
		i=0;
		min = 10;
		max = 0;
		
		while(i<=10) {
			i++;
			random = (int) (Math.random()*10);
			System.out.println(random);
			
			if(random>max) {
				max=random;
				}
			else if(random<min) {
				min=random;
				}
			}
		System.out.println("Max -----> "+max);
		System.out.println("Max -----> "+min);
		
	}

}
