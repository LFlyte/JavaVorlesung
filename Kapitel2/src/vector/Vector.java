package vector;

/*
 * Kapitel 2: Objekte und Klassen
 * 
 * zweidimensionaler Vektor als Objekt
 * 
 * Fields = Attribute -> Zustand/Eigenschaften/Daten
 * methods = Methoden -> Verhalten/Fähigkeiten/Operationen/Funktionen
 * 
 * Klasse: Bauplan eines Objekts
 * Mathematisch			|Klassendiagramm(UML)				|Java-Klasse
 * _____________________|___________________________________|______________________
 * Attribute: 			|Vector								|class Vector{
 * (x y)				|___________________________________|	
 * 						|x: double							|	double x;
 * 						|y: double							|	double y;
 * 						|___________________________________|	
 * Methoden:			|									|
 * l * (x y)			|scalarMult(lambda:double):Vector	|	Vector scalarMult(double lambda){...}
 * 						|add(v:Vector):Vector				|	Vector add(Vector Vector){}
 * _____________________|___________________________________|____________________________
 * 
 * Objekt: erstellte Instanz einer Klasse z.B. v = (3 1), w = (5 2)
 * 
 * Objektdiagramm UML
 * ______________________________
 * |w:Vector					|
 * |--------					|
 * |____________________________|
 * |x = 3						|
 * |y = 1						|
 * |____________________________|
 * Java Code:
 * 	Objekt-Erzeugung:
 * 		Vector v = new Vector();
 * 	in Attribute Daten setzen:
 * 		v.x = 3.0 //3.0 da double Gleitkomma
 * 		v.y = 1.0 //v.y: Punktnotation
 * 	Methodenaufruf:
 * 		Vector u = v.scalarMult(2.0) //Streckung mit Faktor 2
*/

public class Vector {
    
    //Attribute
    double x;
    double y;

    //Methoden
    Vector scalarMult(double lambda){
    	Vector u = new Vector();
    	u.x = lambda * this.x;
    	u.y = lambda * this.y;
    	return u;
    }

    Vector add(Vector w){
    	Vector u = new Vector();
    	u.x = w.x + this.x;
    	u.y = w.y + this.y;
    	return u;
    }

    void printToConsole() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

}
