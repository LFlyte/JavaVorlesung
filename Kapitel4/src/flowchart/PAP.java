package flowchart;

/*
 * Programmablaufplan:
 *
 * Start/Stop(Terminator): Kreis/Oval/Rechteck mit runden Ecken
 * Verbindung nächstes Element: Pfeil/Linie
 * Operation: Rechteck
 * UnterOP: Rechteck mit doppelten vertikalen Linien
 * Verzweigung: Raute
 * Ein-/Ausgabe: Parallelogramm
*/

public class PAP {
    int month = 5;
    int days = 0;
    int sum = 0;
    int i = 1;

    void ifswitchwhile(){

    	if (month > days){
    		System.out.println("Unwahrscheinlich");
    	}

    	switch (month){ //Welche Monate haben wie viele Tage?
    		case 2: days = 28; break;
    		case 4: //Ohne break wird in den nächsten case gesprungen, (April, Juni, September und November jeweils 30 Tage)
    		case 6: 
    		case 9: 
    		case 11: days = 30; break;
    		default: days = 31; break;
    	}

    	while(i <= 100){
    		//sum = sum + i;
    		//i = i + 1;
    		// ->
    		//sum += i;
    		//i++;
    		// ->
    		sum += i++;	
    	}

    	sum = 0;
    	i = 1;

    	do {
    		sum += i++;
    	} while(); // Wie while(), aber Prüfung erst am Ende der Anweisung

    	sum = 0;
    	i = 1;

    	for (int i = 1; i <= 100; i++) {//i++ wird am Ende ausgeführt
    		sum += i;
    	}

    	// break verlässt nur innerste Schleife
	}

	int pap(){
		int i = 1;
		do {
			System.out.println(i);

			if (i == 39){
				i = 61;
			}
			else {
				i++;
			}
		} while(i <= 100);

	}
}
