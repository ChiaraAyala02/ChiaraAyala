package mod2;

public class Ejercicio_Práctico1 {

	public static void main(String[] args) {
		
		byte 		bmin = -128;
		byte 		bmax = 127;
		short 	smin = (short)Math.pow(2, 15);
		short 	smax = (short) ((short)Math.pow(2, 15) - 1);
		int 	imax = (int)-1-(int)Math.pow(2, 31);
		int 	imin = (int)Math.pow(2, 31);
		long 	lmin = (long)-1-(long)Math.pow(2, 63);
		long 	lmax = (long)Math.pow(2, 63);
		System.out.println("tipo\tminimo\tmximo");
		System.out.println("\nbyte\t"+bmin+"\t\t\t"+bmax);
		System.out.println("\nshort\t"+smin+"\t\t\t"+smax);
		System.out.println("\nint\t"+imin+"\t\t"+imax); 
		System.out.println("\nlong\t"+lmin+"t"+lmax);
	}
}
