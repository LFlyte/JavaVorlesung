package student;

/*
 * OOA: Objektorientierte Analyse
 * 	- fachliche Anforderungen sammeln
 * 	- Modellierung in fachlichen Objekten
 * 	- Anwendungsfälle/use cases
 * am Beispiel Student: 
 * 	- Attribute: Vorname, Nachname, Matrikelnummer, Adresse (Straße, Wohnort)
 * 	- Methoden: grüßen, vorstellen
 * 
 * OOD: Objektorientiertes Design
 * 	- Modellierung technischer Objekte(UML)
 * 	- Infrastruktur. Server, Datenbank, GUI, ...
 * 	- Resultat: Programmiervorlage
 * Klassendiagramm
 * 	Komposition: Teilmengenbeziehung; Beispiel: Raum ist Teil eines Gebäudes, kann ohne Gebäude nicht existieren
 *	Aggregation: wie Komposition, aber Teilmenge kann auch ohne große Menge existieren
 * 	siehe Wikipedia-Artikel Klassendiagramm
 * __________________________						____________________
 * |Student					|						|Adress				|
 * |––––––––––––––––––––––––|0..*				   1|–––––––––––––––––––|
 * |name:String				|/\_____________________|street:String		|
 * |firstName:String		|\/	Aggregation:		|city:String		|
 * |stNr:int				|	Adressen auch ohne	|–––––––––––––––––––|
 * |adress:Adress			|	Student möglich		|___________________|
 * |––––––––––––––––––––––––|
 * |sayHello()				|
 * |sayName()				|
 * |________________________|
 * 
 * OOP: Objektorientierte Programmierung
 */

public class Student {
	
	//Attribute
	String name;
	String firstName;
	int stNr;
	Address address;
	
	//Methoden
	void sayHello() {
		System.out.println("Griaß di");
	}
	void sayName() {
		System.out.println("I bins, da " + name + " " + firstName);
	}
}
