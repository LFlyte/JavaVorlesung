package student;

public class Main {
	public static void main(String[] args){
    	Student s = new Student();
		s.firstName = "Sepp";
		s.name = "Huber";
		s.stNr = 906090;
		s.address = new Address();
		s.address.street = "Hochschulstr. 1";
		s.address.city = "Rosenheim";
		
		s.sayHello();
		s.sayName();
	}
}
