package es_1;

public class Main {
	public static void main(String[] args) {
		String numeroPari = "42";
		String numeroDispari = "37";

		System.out.println(numeroPari + " è un numero pari? " + PariDispari.stringaPariDispari(numeroPari));
		System.out.println(numeroDispari + " è un numero pari? " + PariDispari.stringaPariDispari(numeroDispari));

		int anno1 = 2023;
		int anno2 = 2025;

		System.out.println(AnnoBisestile.annoBisestile(anno1));
		System.out.println(AnnoBisestile.annoBisestile(anno2));
	}
}
