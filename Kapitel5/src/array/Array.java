package array;

/*
 * Datenstruktur für mehrere Elemente vom gleichen Typ
 * Länge(length): Anzahl n der Elemente
 * Index: 0-basiert (0, 1, 2, ..., n-1)
 * double[], oder auch Vector[]
 * Punktnotation: Zugriff auf Attribute/Methoden eines Objekts
*/

public class Array {
	public static void main(String[] args){
		double[] kekse; //nur initialisierung
		double[] kuchen = new double[33]; //Speicherplatz für 33 Elemente
		double[] torte = {2.3, 4.6, 42.1, 1.414141}; //mit Wertzuweisung

		double k = torte[3];
		torte[2] = 42.0;

		int len = kuchen.length;
	}
}
