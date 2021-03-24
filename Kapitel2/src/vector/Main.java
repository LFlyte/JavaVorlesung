package vector;

public class Main {
    public static void main(String[] args) {
    	
		Vector v = new Vector();
		v.x = 3.0;
		v.y = 1.0;
		v.printToConsole();
	
		Vector w = new Vector();
		w.x = 5.0;
		w.y = 2.0;
		w.printToConsole();
		
		Vector MultResult = v.scalarMult(2);
		Vector AddResult = v.add(w);
		//System.out.println("(" + MultResult.x + ", " + MultResult.y + ")"); // syso als Makro für System.out.println()
		//System.out.println("(" + AddResult.x + ", " + AddResult.y + ")");
		MultResult.printToConsole();
		AddResult.printToConsole();
	}
}
