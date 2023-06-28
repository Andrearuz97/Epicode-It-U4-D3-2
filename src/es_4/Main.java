package es_4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci un numero intero: ");
		int numero = scanner.nextInt();
		scanner.close();

		For.countdown(numero);
	}
}
