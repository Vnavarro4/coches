package ruletaCasino;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("apuesta");

		int apuesta = scanner.nextInt();
		int numGanador = (int) (Math.random() * 37);
		String colorGanador = obtenerColor(numGanador);
		//parImpar
		if (esParImpar() == numGanador) {
			int ganancia = apuesta * 2;
			System.out.println("has ganado " + apuesta + " mas lo que has apostado que es igual a " + ganancia);
		} else {
			System.out.println("has perdido see u baby ;) ");
		}
		System.out.println("ha salido el numero " + numGanador);
		// color
		if (obtenerColor(apuesta) == colorGanador) {
            int ganancia = apuesta * 2;
            System.out.println("Has ganado " + ganancia + ".");
        } else {
            System.out.println("Has perdido, inténtalo de nuevo.");
        }
	}

}
