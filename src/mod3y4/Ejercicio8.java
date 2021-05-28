package mod3y4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		int Player1, Player2;
		
		System.out.println("------------- Piedra Papel Tijeras -------------");
		System.out.println("-------------   (1)   (2)    (3)   -------------");
		
		System.out.print("Jugador 1 ----->  ");
		Player1 = escaner.nextInt();
		System.out.print("Jugador 2 ----->  ");
		Player2 = escaner.nextInt();
		
		if(Player1==0) {
			if(Player2==1) {
				System.out.println("Jugador 2, GANASTE");
			}
			else if(Player2==2) {
				System.out.println("Jugador 1, GANASTE");
			}
			else {
				System.out.println("Empataron...");
			}
		}
		else if(Player1==1) {
			if(Player2==0) {
				System.out.println("Jugador 1, GANASTE");
			}
			else if(Player2==2) {
				System.out.println("Jugador 2, GANASTE");
			}
			else {
				System.out.println("Empataron...");
			}
		}
		else if(Player1==2) {
			if(Player2==0) {
				System.out.println("Jugador 2, GANASTE");
			}
			else if(Player2==1) {
				System.out.println("Jugador 1, GANASTE");
			}
			else {
				System.out.println("Empataron...");
			}
		}
		escaner.close();
	}

}
