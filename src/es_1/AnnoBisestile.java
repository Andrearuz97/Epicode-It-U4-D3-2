package es_1;

public class AnnoBisestile {
	public static boolean annoBisestile(int anno) {
		if (anno % 4 == 0) {
			if (anno % 100 == 0) {
				return anno % 400 == 0;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
}
