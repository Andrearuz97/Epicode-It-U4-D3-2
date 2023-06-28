package es_3;

import java.util.Scanner;

public class While {
	public static void splitString() {
		Scanner scanner = new Scanner(System.in);
		String input;

		do {
			System.out.print("Inserisci una stringa (inserisci 'q' per uscire): ");
			input = scanner.nextLine();

			if (!input.equals("q")) {
				String[] caratteri = input.split("");
				StringBuilder output = new StringBuilder();

				for (String carattere : caratteri) {
					output.append(carattere).append(",");
				}

				output.deleteCharAt(output.length() - 1); // Rimuovi l'ultima virgola

				System.out.println("Stringa suddivisa: " + output.toString());
			}
		} while (!input.equals("q"));

		scanner.close();
	}
}
