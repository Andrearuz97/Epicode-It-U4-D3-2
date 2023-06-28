package es_1;

public class Main {
	public static void main(String[] args) {
		String numeroPari = "42";
		String numeroDispari = "37";

		System.out.println(numeroPari + " è un numero pari: " + PariDispari.stringaPariDispari(numeroPari));
		System.out.println(numeroDispari + " è un numero dispari: " + PariDispari.stringaPariDispari(numeroDispari));

		int anno1 = 2020;
		int anno2 = 2021;

		System.out.println(AnnoBisestile.annoBisestile(anno1)); // Output: true
		System.out.println(AnnoBisestile.annoBisestile(anno2)); // Output: false
	}
}
