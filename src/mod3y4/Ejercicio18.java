package mod3y4;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		int i, i2, result;
		result = 0;
		
		for(i=1;i<11;i++) {
			for(i2=1;i2<11;i2++) {
				result =i *i2;
				System.out.println(i+" * "+i2+" = "+result);
			}
			System.out.println("");
		}

	}

}
